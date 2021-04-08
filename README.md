# Api-teste---comeia

#Operações realizadas

<h2>Criar novo</h2>
POST/ <br>
http://localhost:8080/salvar  <br>

##response  
<br>
{
"nome":"nome da empresa",
"segmento":"tecnologia",
"cnpj":"1234567890",
"email":"Email@email.com"


}
<hr>
<h2>Listar todos </h2>
<hr>
GET/ <br>
http://localhost:8080/listar <br>

##response [{"id":1,"nome":"nome da empresa","segmento":"tecnologia","cnpj":111111111,"email":"meuEmail@email.com"}]
<hr>

<h2>Atualizar existente</h2>
PUT/ <br>
http://localhost:8080/atualizar/{id}

<hr>
<h2>Deletar um item</h2>
<hr>
DELETE/ <br>
http://localhost:8080/deletar/{id}

<hr>
<h2>Busca por nome</h2>
<hr>
GET/ <br>
http://localhost:8080/buscaNome/{nome}

<hr>
<h2>Busca por Id</h2>
<hr>
GET/ <br>
http://localhost:8080/buscaId/{id}

<hr>
<h2>Busca por CNPJ</h2>
<hr>
GET/ <br>
http://localhost:8080/buscaCnpj/{cnpj}

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
