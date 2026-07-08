# 📦 Controle de Estoque

Sistema de Controle de Estoque desenvolvido para estudo e portfólio utilizando **Java**, **Spring Boot** e **PostgreSQL**.

O objetivo do projeto é simular um sistema utilizado por pequenas e médias empresas para gerenciamento de estoque, aplicando boas práticas de desenvolvimento Back-end, arquitetura em camadas e APIs REST.

---

# 🚀 Tecnologias Utilizadas

- Java 21
- Spring Boot
- Spring Data JPA
- Hibernate
- PostgreSQL
- Maven
- Git
- GitHub
- Postman

---

# 🏗 Arquitetura do Projeto

O projeto segue a arquitetura em camadas, separando cada responsabilidade da aplicação.

```
Cliente/Postman
       │
       ▼
Controller
       │
       ▼
Service
       │
       ▼
Repository
       │
       ▼
Hibernate / JPA
       │
       ▼
PostgreSQL
```

---

# 📁 Estrutura do Projeto

```
src
└── main
    └── java
        └── com.controleestoque.backend
            ├── controller
            ├── entity
            ├── exception
            ├── repository
            ├── service
            └── BackendApplication
```

---

# ✅ Funcionalidades Implementadas

## Produtos

- Cadastro de produtos
- Listagem de produtos
- Persistência dos dados no PostgreSQL
- Geração automática das tabelas com Hibernate
- API REST

### Validações

- Código obrigatório
- Nome obrigatório
- Código único
- Estoque não pode ser negativo
- Custo não pode ser negativo
- Preço de venda não pode ser negativo
- Preço de venda não pode ser menor que o custo

### Tratamento de Exceções

- Tratamento global de RuntimeException
- Retorno HTTP 400 para regras de negócio

---

# 📡 Endpoints da API

## Produtos

| Método | Endpoint | Descrição |
|---------|----------|-----------|
| POST | `/produtos` | Cadastra um novo produto |
| GET | `/produtos` | Lista todos os produtos |

---

# 🗄 Banco de Dados

Banco utilizado:

- PostgreSQL

Tabela implementada até o momento:

- Produtos

A tabela é criada automaticamente pelo Hibernate utilizando:

```properties
spring.jpa.hibernate.ddl-auto=update
```

---

# ▶ Como Executar o Projeto

### Clone o repositório

```bash
git clone https://github.com/RobsonFacione/ControleEstoque.git
```

### Entre na pasta do projeto

```bash
cd ControleEstoque/backend
```

### Configure a variável de ambiente

Windows (PowerShell)

```powershell
$env:DB_PASSWORD="SUA_SENHA"
```

Ou configure permanentemente a variável de ambiente:

```
DB_PASSWORD
```

### Execute a aplicação

```bash
./mvnw spring-boot:run
```

A aplicação ficará disponível em:

```
http://localhost:8080
```

---

# 🧪 Testes

Os endpoints estão sendo testados utilizando o Postman.

Exemplo de cadastro:

```json
{
    "codigo": "P001",
    "nome": "Mouse Gamer",
    "categoria": "Periféricos",
    "marca": "Logitech",
    "unidade": "UN",
    "custo": 120.50,
    "precoVenda": 199.90,
    "estoque": 15,
    "estoqueMinimo": 5,
    "localizacao": "A1-01",
    "ativo": true
}
```

---

# 📚 Conceitos Aplicados

Durante o desenvolvimento deste projeto estão sendo aplicados conceitos como:

- Programação Orientada a Objetos (POO)
- Spring Boot
- Spring Data JPA
- Hibernate
- API REST
- CRUD
- Entity
- Repository
- Service
- Controller
- Injeção de Dependência
- Tratamento Global de Exceções
- PostgreSQL
- Maven
- Git e GitHub

---

# 📌 Próximas Implementações

- Buscar produto por ID
- Atualizar produto
- Excluir produto
- Cadastro de Clientes
- Cadastro de Fornecedores
- Categorias
- Movimentações de Entrada
- Movimentações de Saída
- Dashboard
- Relatórios
- Autenticação de Usuários
- Controle de Permissões
- Front-end em React

---

# 👨‍💻 Autor

**Robson Luiz Facione**

- LinkedIn: https://www.linkedin.com/in/robson-luiz-facione/
- GitHub: https://github.com/RobsonFacione