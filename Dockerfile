# Etapa de construção usando Maven
FROM maven:3.9.9-eclipse-temurin-21 AS build

# Defina o diretório de trabalho
WORKDIR /app

# Copie o arquivo pom.xml e baixe as dependências
COPY pom.xml .
RUN mvn dependency:go-offline

# Copie o código-fonte da aplicação
COPY src ./src

# Compile a aplicação e crie o JAR
RUN mvn clean package -DskipTests

# Etapa de execução
FROM eclipse-temurin:21-jre-alpine

# Defina o diretório de trabalho
WORKDIR /app

# Copie o JAR gerado da etapa anterior
COPY --from=build /app/target/*.jar ./app.jar

# Exponha a porta que a aplicação irá rodar
EXPOSE 8080

# Comando para executar a aplicação
CMD ["java", "-jar", "app.jar"]
