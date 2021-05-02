# projeto-simples
Projeto Simples que usa Spring Boot e JPA

# configurando
Na pasta config, crie um arquivo application.yml seguindo o exemplo do arquivo application-example.yml

# iniciando
Execute a classe ProjetoSimplesApplication pela sua IDE. Nota: a pasta raiz da execução deve estar correta para que o
Spring encontre os arquivos dentros da pasta 'config'.

# testando
Para verificar se está funcionando, acesse http://localhost:8080/status

# conteúdo

## MensagensController
É uma controller de exemplo, mostrando o que é possível fazer nas controller do Spring Boot. Acesse `/mensagens` para ver
uma lista de todas as mensagens.

Para filtrar, passe uma variável de consulta chamada filtro, dessa forma: `/mensagens?filtro=teste`

Para exibir somente a mensagem com id = 2, acesse: `/mensagens/2`

Também é possível adicionar mensagens. No entanto, como é por método HTTP POST, não será possível fazer direto pelo
navegador, sendo necessária alguma ferramenta, como o Postman.
