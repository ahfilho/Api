
# Api

# Utilizei a IDE spring tools suite.
É preciso baixar o projeto e descompactar. <br>
Em seguida, com a IDE  aberta, na aba: <br>
<b> FILES > OPEN PROJECT FROM FILE SYSTEM >  DIRECTORY > procurar a pasta do projeto e abrir.
O próximo passo é ir na aba BOOT DASHBOARD e executar o projeto. </b>


### Dependências utilizadas 
-Lombok <br>
-validation <br>
-dev tools <br>
-spring web <br>
-H2database <br>

### Design pattern utilizado
DTO

# Operações realizadas pela API
<li>Salvar</li>
<li>Listar</li>
<li>Alterar</li>
<li>Deletar</li>
<li>Busca por ID</li>
<li>Busca por Nome</li>
<li>Busca por CNPJ</li>
<li>Data/hora no back</li>
<br>
<hr>

<h4>Pacotes e classes</h4>

# Package --> Class

controller --> Controller <br>
model -->  Empresa <br>
date --> DateUtil <br>
repository --> Repository <br>
services --> Servicos <br>
INTERFACE -- actions --> Acoes <br>
<hr>
# Postman para realizar os testes das requisições de acordo com as operações mencionadas
<hr>
<h4> Metodos utilizados nas requisiçoes</h4>

GET -- Retorna um ou mais registros
POST -- Cria um novo registro
PUT -- Altera um registro
DELETE -- Remove um registro

# RESPOSTAS DE REQUISIÇÃO

Respostas de informação (100-199)
Respostas de sucesso (200-299)
Redirecionamentos (300-399)
Erros do cliente (400-499)
Erros do servidor (500-599)

<h2>Criar novo</h2>
<li>Method: <br>
POST/</li> <br>
<b>URL</b> http://localhost:8080/salvar  <br>
<h4>response<h4>  
<br>
{
"nome":"nome da empresa",
"segmento":"tecnologia",
"cnpj":"1234567890",
"email":"MeuEmail@email.com"
}
 
<hr>
<h2>Listar todos </h2>
<li>Method: <br>
GET/</li> <br>
<b>URL</b> http://localhost:8080/listar <br>
<h4>response</h4> [{"id":1,"nome":"nome da empresa","segmento":"tecnologia","cnpj":1234567890,"email":"meuEmail@email.com"}]
<hr>

<h2>Atualizar existente</h2>
<li/>Method: <br>
PUT/</li> <br>
<b>URL</b> http://localhost:8080/atualizar/{id}
<h4>response</h4> [{"id":1,"nome":"Empresa A","segmento":"comércio","cnpj":1020304050,"email":"Email@email.com"}]
<hr>

<h2>Deletar um item</h2>
<li>Method: <br>
DELETE/</li> <br>
<b>URL</b> http://localhost:8080/deletar/{id}
<h4>response</h4> "OK"
<hr>

<h2>Busca por nome</h2>
<li>Method: <br>
GET/</li> <br>
<b>URL</b> http://localhost:8080/buscaNome/{nome}
<h4>response</h4> 

    {
        "id": 1,
        "nome": "nome da empresa",
        "segmento": "tecnologia",
        "cnpj": 111111111,
        "email": "meuEmail@email.com"
    }
<hr>

<h2>Busca por Id</h2>
<li>Method: <br>
GET/</li> <br>
<b>URL</b> http://localhost:8080/buscaId/{id}
<h4>response</h4>
{
        "id": 1,
        "nome": "nome da empresa",
        "segmento": "tecnologia",
        "cnpj": 111111111,
        "email": "meuEmail@email.com"
    }
<hr>

<h2>Busca por CNPJ</h2>
<li>Method <br>
GET/</li> <br>
<b>URL</b> http://localhost:8080/buscaCnpj/{cnpj}
<h4>response</h4>
  {
        "id": 1,
        "nome": "nome da empresa",
        "segmento": "tecnologia",
        "cnpj": 111111111,
        "email": "meuEmail@email.com"
    }
<hr>


