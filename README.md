# 🚀 API de Gerenciamento de Usuários

API backend desenvolvida com Java e Spring Boot para gerenciamento de usuários, com autenticação e autorização utilizando JWT.

---

## 📌 Sobre o projeto

Este projeto foi criado com o objetivo de aplicar boas práticas de desenvolvimento backend, incluindo:

- Arquitetura REST
- Segurança com JWT
- Integração com banco de dados PostgreSQL
- Containerização com Docker
- Deploy em nuvem (Render)

---

## ⚙️ Tecnologias utilizadas

- Java 17+
- Spring Boot
- Spring Security
- JWT (JSON Web Token)
- PostgreSQL
- Docker
- Maven
- Git e GitHub

---

## 🔐 Funcionalidades

- ✅ Cadastro de usuários
- ✅ Login com autenticação JWT
- ✅ Autorização de rotas protegidas
- ✅ CRUD de usuários
- ✅ Persistência com PostgreSQL

---

## 🌐 API Online

🔗 https://api-backend-com-spring-boot-e-jwt.onrender.com

---

## 📂 Estrutura do projeto

src/
├── controller
├── service
├── repository
├── model
└── config

---

## ▶️ Como rodar o projeto localmente

### Pré-requisitos

- Java 17+
- Maven
- PostgreSQL

---

### 🔧 Passos

```bash
# Clonar repositório
git clone https://github.com/lucasrochadnsx/API-backend-com-Spring-Boot-e-JWT.git

# Entrar na pasta
cd API-backend-com-Spring-Boot-e-JWT

# Rodar o projeto
mvn spring-boot:run

# Build da imagem
docker build -t usermanagement-api .

# Rodar container
docker run -p 8080:8080 usermanagement-api

🔑 Autenticação

A API utiliza JWT para autenticação.

Fluxo:
Usuário faz login
Recebe um token JWT
Envia o token no header:

Authorization: Bearer SEU_TOKEN