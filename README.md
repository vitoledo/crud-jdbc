# CRUD JDBC - Projeto Java

Este projeto tem como objetivo implementar operações CRUD (Create, Read, Update, Delete) utilizando JDBC em Java.

## Requisitos

- Criar uma tabela chamada `Categorias` com os campos: `id`, `nome`, `ativo`.
- Criar uma tabela chamada `Produtos` com os campos: `id`, `nome`, `preco`.
- Implementar as classes modelo `Categoria` e `Produto`.
- Implementar as classes DAO para operações de banco de dados (CRUD) das tabelas `Categorias` e `Produtos`.
- No arquivo `Main.java`, executar operações CRUD para as tabelas do projeto.
- Salvar o projeto no GitHub e entregar o link do repositório.

## Estrutura do Projeto

- `src/model/Categoria.java`: Classe modelo da categoria.
- `src/model/Produto.java`: Classe modelo do produto.
- `src/dao/CategoriaDAO.java`: Classe responsável pelas operações CRUD da tabela `Categorias`.
- `src/dao/ProdutoDAO.java`: Classe responsável pelas operações CRUD da tabela `Produtos`.
- `src/Main.java`: Arquivo principal para execução dos testes CRUD.

## Como executar

1. Configure o banco de dados conforme instruções do professor.
2. Compile e execute o projeto.
3. Realize operações CRUD conforme exemplos no `Main.java`.

---
Salve o projeto no GitHub e envie o link