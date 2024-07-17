# Projeto ForumHubONE - Challenge One Alura Oracle

Este projeto foi realizado para o aprendizado e realização do Challenge Alura do programa ONE - Especialização Back End Java.
Ele foi projetado em java e tendo como principal pilar a framework Spring.

## Tecnologias Utilizadas

- Java
- Spring Boot
- Spring Web
- Spring Data JPA
- Spring Security
- Hibernate
- Lombok
- Banco de Dados MySQL
- Postman
- JWT
- Princípios de Clean Arch
- SOLID


# Consumo da Aplicação

> [!TIP]
> No diretório `./Postman Export` existe um arquivo nomeado `ForumHubONE.postman_collection.json` com todos os endpoints configurados.

A aplicação é acessada através de endpoints HTTP. Existe um mapa dos endpoint em formato Json no diretório: `Postman Export`.

# Banco de Dados

Foi utilizado o MySQL como banco de dados devido ao seu desempenho, escalabilidade e ampla adoção no mercado, facilitando futuras implementações colaborativas.

# Como Executar

**Pré-requisitos:**

- JDK instalado (versão 8 ou superior)
- Maven instalado
- Terminal de comandos

**Clonar o Repositório:**

```sh
git clone https://github.com/pedroHenrique57/ForumHubONE.git
```

## Configurar o Banco de Dados

Configure as propriedades do banco de dados no arquivo `application.properties`.

## Compilar e Executar o Projeto

> [!WARNING]
> Dentro de um terminal, verifique se você está no diretório do projeto `./forumHubONE` para rodar o comando.  
> caso esteja com dúvida verifique se existe um arquivo nomeado `Pom.xml` no diretório.

Navegue até o diretório do projeto e abra um terminal. Neste terminal execute o seguinte comando:

```sh
mvn spring-boot:run
```

## Contribuições

Contribuições são bem-vindas! Sinta-se à vontade para abrir issues e pull requests para melhorias e correções.

## Licença

Este projeto está licenciado sob a licença MIT. Acesse o arquivo `LICENSE` para mais informações.
