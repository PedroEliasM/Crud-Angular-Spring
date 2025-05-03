### Dependências:
node 16.10.0

Angular CLI 14.2.13

npm 7.24.0

Java 17 LTS

Spring boot 3.4.5 + Maven

MySQL Workbench 8

##

### Script de criação do banco de dados:

CREATE DATABASE IF NOT EXISTS pessoa_db;
USE pessoa_db;
CREATE TABLE IF NOT EXISTS pessoa (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    nome VARCHAR(100) NOT NULL,
    sobrenome VARCHAR(100) NOT NULL,
    idade INT NOT NULL,
    cidade VARCHAR(100) NOT NULL,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP
);

##

### Portas:
MySQL port: 3306

Server port: 8080

Frontend port: 4200

### Usuário e senha no MySQL:
user: root

password: root

### Como Rodar

1- Backend

Abrir o cmd na pasta "crud-spring" e executar: 

mvnw.cmd spring-boot:run

2- Frontend

Abrir o cmd na pasta "crud-angular" e executar: 

npm install

ng serve

3- Digitar URL no navegador:

http://localhost:4200/