# BarberShop API

Uma API REST em desenvolvimento para gerenciamento de usuários e recursos de barbearia, construída com Spring Boot, JPA/Hibernate e banco em memória H2 para desenvolvimento.

## Tecnologias até o momento:
- **Java 21**
- **Spring Boot 3** (Web, Actuator)
- **Spring Data JPA** (Hibernate)
- **H2 Database** (ambiente local)
- **Lombok**
- **OpenAPI/Swagger** via `springdoc-openapi`

## Requisitos
- JDK 21+
- Maven 3.9+

## Perfis
- O profile ativo é configurado em `src/main/resources/application.properties` via `spring.profiles.active`.
- Para desenvolvimento, utilize o profile local (ex.: `local` ou `local_startDB`, conforme configurado).
- O profile local pode inserir dados iniciais (seed) para facilitar os testes.

## Banco de Dados (H2)
- Console: `http://localhost:8080/h2-console`
- JDBC URL padrão: `jdbc:h2:mem:barberdb`
- Usuário/senha: ver `application.properties`

## Documentação da API (Swagger)
- UI: `http://localhost:8080/swagger-ui.html`

## Endpoints principais
Base path: `/users`

- `GET /users` — lista todos os usuários
- `GET /users/{email}` — busca por e-mail
- `POST /users` — cria usuário
- `PUT /users?id={id}` — atualiza nome/e-mail pelo id
- `DELETE /users?email={email}` — remove por e-mail

### Exemplo de payload (POST /users)
```json
{
  "name": "Novo Usuário",
  "email": "novo@example.com",
  "password": "teste123"
}
```

Observações:
- `email` é único. Não repita o mesmo e-mail ao criar.
- `id` é gerado automaticamente (IDENTITY). Não envie `id` no POST.

## Estrutura do projeto (resumo)
```
src/main/java/barber
  ├─ controller       # Controllers REST
  ├─ service          # Regras de negócio
  ├─ repository       # Spring Data JPA
  ├─ model            # Entidades JPA
  └─ config           # Configurações (perfis, seed, etc.)
```

## Desenvolvimento
- Hot reload com `spring-boot-devtools`.
- Logs SQL habilitados (`spring.jpa.show-sql=true`).

## Roadmap
- Validações (Bean Validation) e tratamento de erros (ExceptionHandler).
- Domínio: barbeiros, agendamentos, serviços, etc.
- Testes unitários e de integração.

## Licença
Este projeto é proprietário. Todos os direitos reservados. Veja o arquivo `LICENSE` para detalhes.

## 👤 Autor
Desenvolvido por **Ariel França**.
