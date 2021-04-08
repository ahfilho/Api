# Api-teste---comeia

#Operações realizadas

<h2>Criar novo</h2>
<hr>
POST/ <br>
http://localhost:8080/salvar

<br> 
<h2>Listar todos </h2>
<hr>
GET/ <br>
http://localhost:8080/listar

<h2>Atualizar existente</h2>
<hr>
PUT/ <br>
http://localhost:8080/atualizar/{id}

<br>
<h2>Deletar um item</h2>
<hr>
DELETE/ <br>
http://localhost:8080/deletar/{id}

<br>
<h2>Busca por nome</h2>
<hr>
GET/ <br>
http://localhost:8080/buscaNome/{nome}

<h2>Busca por Id</h2>
<hr>
GET/ <br>
http://localhost:8080/buscaId/{id}

<h2>Busca por CNPJ</h2>
<hr>
GET/ <br>
http://localhost:8080/buscaCnpj/{cnpj}


<br>


<b>Package --> Class
</b>
controller --> Controller <br>
model -->  Empresa <br>
date --> DateUtil <br>
repository --> Repository <br>
services --> Servicos <br>
INTERFACE -- actions --> Acoes <br>

#Postman para realizar os testes das requisições de acordo com as operações mencionadas
