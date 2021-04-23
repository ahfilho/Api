package br.com.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import lombok.extern.log4j.Log4j2;
import br.com.date.DateUtil;
import br.com.model.Empresa;
import br.com.model.EmpresaDTO;
import br.com.model.EmpresaRespostaDTO;
import br.com.servicos.*;

@RestController()
@Log4j2
public class Controller {

	@Autowired
	private DateUtil dateUtil;

	@Autowired
	private Servicos serv;

	@GetMapping("/listar")
	public ResponseEntity<List<Empresa>> listar() {
		// log4j2 == data e hora no back
		log.info(dateUtil.formatLocalDateTimeDatabaseStyle(LocalDateTime.now()));
		return ResponseEntity.ok().body(serv.listar());
	}

	@PostMapping("/salvar")
	public ResponseEntity<EmpresaRespostaDTO> adicionar(@Valid @RequestBody EmpresaDTO dto, HttpStatus created) {
		log.info(dateUtil.formatLocalDateTimeDatabaseStyle(LocalDateTime.now()));

		ResponseEntity.ok("O nome não pode ser nulo");
		
		//responseEntity = para situações de retorno do serviço
		//OK = envia todas as notas ao servidor e devolve o status 200, que deu tudo certo.
		//ResponseEntity.ok().body(this.serv.adicionar(dto.transformaParaObjeto()));
		Empresa empresa = this.serv.adicionar(dto.transformaParaObjeto());	
		return new ResponseEntity<>(EmpresaRespostaDTO.transformaEmDTO(empresa),  HttpStatus.CREATED);
	}


	@GetMapping("/buscaId/{id}")
	public ResponseEntity<Empresa> getByID(@PathVariable long id) throws Exception {

		return ResponseEntity.ok().body(serv.getById(id));
	}

	@PutMapping("/atualizar/{id}")
	public ResponseEntity<Empresa> atualizar(@PathVariable long id, @RequestBody Empresa empresa) throws Exception {
		empresa.setId(id);
		return ResponseEntity.ok().body(this.serv.alterar(empresa));
	}
	
	//MAIS TARDE OLHAR ESSE PATCH
	@PatchMapping("/attparcial/{id}")
	public ResponseEntity<Empresa> atualizarParcial(@PathVariable long id, @RequestBody Empresa empresa) throws Exception{
	empresa.setId(id);
	return ResponseEntity.ok().body(this.serv.alterarParcial(empresa));
		
	}

	@DeleteMapping("/deletar/{id}")
	public HttpStatus deletar(@PathVariable long id) throws Exception {
		this.serv.deletar(id);
		return HttpStatus.OK;
	}

	@GetMapping("/buscaNome/{nome}")

	public ResponseEntity<Empresa> buscaNome(@PathVariable String nome) throws Exception {
		return ResponseEntity.ok().body(serv.findByNome(nome));
	}

	@GetMapping("/buscaCnpj/{cnpj}")
	public ResponseEntity<Empresa> findByCnpj(@PathVariable int cnpj) throws Exception {
		return ResponseEntity.ok().body(serv.findByCnpj(cnpj));
	}
}
