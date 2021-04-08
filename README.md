# Api-teste---comeia

#Operações realizadas

<h2>Criar novo</h2>
<li>Method: <br>
POST</li>/ <br>
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

<h4>response</h4>
 [{"id":1,"nome":"Empresa A","segmento":"comércio","cnpj":1020304050,"email":"Email@email.com"}]
<hr>
<h2>Deletar um item</h2>
<hr>
<li>Method: <br>
DELETE/</li> <br>
<b>URL</b> http://localhost:8080/deletar/{id}
<h4>response</h4> "OK"

<hr>
<h2>Busca por nome</h2>
<hr>
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
<hr>
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
<hr>
<li>Method <br></li>
<td>GET/ <br>
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


<b>Package --> Class
</b>
controller --> Controller <br>
model -->  Empresa <br>
date --> DateUtil <br>
repository --> Repository <br>
services --> Servicos <br>
INTERFACE -- actions --> Acoes <br>

#Postman para realizar os testes das requisições de acordo com as operações mencionadas
