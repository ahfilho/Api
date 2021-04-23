package br.com.servicos;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;
import javax.validation.constraints.Null;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import br.com.repository.Repository;
import javassist.tools.rmi.ObjectNotFoundException;
import br.com.actions.Acoes;
import br.com.model.Empresa;

@Service
@Transactional
public class Servicos implements Acoes {

	@Autowired
	private Repository reposit;

	public Empresa adicionar(Empresa empresa) {
		return reposit.save(empresa);
	}

	public List<Empresa> listar() {
		return reposit.findAll();
	}

	public Empresa alterar(Empresa empresa) throws Exception {
		Optional<Empresa> empresaDb = this.reposit.findById(empresa.getId());
		if (empresaDb.isPresent()) {
			Empresa empresaAtt = empresaDb.get();
			empresaAtt.setId(empresa.getId());
			empresaAtt.setNome(empresa.getNome());
			empresaAtt.setSegmento(empresa.getSegmento());
			empresaAtt.setCnpj(empresa.getCnpj());
			reposit.save(empresaAtt);
			return empresaAtt;
		} else {
			throw new Exception("ERRO AO ATUALIZAR" + empresa.getId());
		}
	}
	public Empresa alterarParcial(Empresa empresa) throws Exception {
		Optional<Empresa> empresaDb = this.reposit.findById(empresa.getId());
		if (empresaDb.isPresent()) {
			Empresa empresaAtt = empresaDb.get();
			empresaAtt.setId(empresa.getId());
			empresaAtt.setNome(empresa.getNome());
			empresaAtt.setSegmento(empresa.getSegmento());
			empresaAtt.setCnpj(empresa.getCnpj());
			reposit.save(empresaAtt);
			return empresaAtt;
		} else {
			throw new Exception("ERRO AO ATUALIZAR" + empresa.getId());
		}
	}

	public Empresa getById(long empresaId) throws Exception {
		Optional<Empresa> empresaDb = this.reposit.findById(empresaId);
		if (empresaDb.isPresent()) {
			return empresaDb.get();
		} else {
			throw new Exception("ERRO O BUSCAR PELO ID" + empresaId);
		}
	}

	public void deletar(long empresaId) throws Exception {
		Optional<Empresa> empresaDb = this.reposit.findById(empresaId);
		if (empresaDb.isPresent()) {
			this.reposit.delete(empresaDb.get());
		} else {
			throw new Exception("ERRO AO DELETAR" + empresaId);
		}
	}

	@Override
	public Empresa findByNome(String nome) throws Exception {
		Empresa empresaGetNome = this.reposit.findByNome(nome);
		if (empresaGetNome != null) {
			return empresaGetNome;
		} else {
			throw new Exception("ERRO AO BUSCAR PELO NOME" + nome);
		}
	}

	@Override
	public Empresa findByCnpj(int cnpj) throws Exception {
		Empresa empresaDb = this.reposit.findByCnpj(cnpj);
		if (empresaDb != null) {
			return empresaDb;
		} else {
			throw new Exception("ERRO AO BUSCAR O CNPJ" + cnpj);
		}

	}

}