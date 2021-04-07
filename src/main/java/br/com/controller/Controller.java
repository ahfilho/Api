package br.com.controller;

import java.time.LocalDateTime;
import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.servicos.Servicos;
import lombok.extern.log4j.Log4j2;
import br.com.date.DateUtil;
import br.com.model.Empresa;

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
	public ResponseEntity<Empresa> adicionar(@Valid @RequestBody Empresa empresa) {
		log.info(dateUtil.formatLocalDateTimeDatabaseStyle(LocalDateTime.now()));

		ResponseEntity.ok("O nome não pode ser nulo");
		return ResponseEntity.ok().body(this.serv.adicionar(empresa));

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
