
# entregador-service

Responsável pelo domínio de entegrador, efetuando a gestão dos dados do cliente e sua lista de produtos
favoritos.

## Stack:
- Docker Compose 3.7
- Java 11
- Maven  
- Spring Boot 2.3.8
- Postgres
- Flyway

## Estrutura de pacotes:

|            Pacote                           |                 Descrição                         |
|---------------------------------------------|:-------------------------------------------------:|
|  com.contaazul.controller                   |  Apis expostas pelo projeto                       |
|  com.contaazul.service                      |  Caso de uso atendido pelo projeto                |
|  com.contaazul.model                        |  Entidades mapeadas no projeto                    |
|  com.contaazul.repository                   |  Repositórios relacionados as entidades           |

## Como configurar o ambiente de desenvolvimento

1. Configurar as tecnologias:
   - JDK 11;
   - Maven;
   - Docker e compose;

2. Inicializar as dependências do projeto, na pasta raiz do projeto executar o comando `make start-environment:`
   >Por padrão, o acesso ao banco `postgres` é feito com a senha `postgres` e usuário `postgres`_


| Serviço    |    Endpoint    |
|------------|:--------------:|
| Postgres   | localhost:5432 |
| apis | localhost:808O/api/entregadorers |


3. Inicialização do projeto :
   - Por CLI, na pasta do projeto rodar o comando `make start-project`
   - por IDE, só executar a classe `Application`:</br>
