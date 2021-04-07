package br.com.metodos;

import br.com.model.Empresa;

public interface Acoes {

	public Empresa findByNome(String nome) throws Exception;

	public Empresa findByCnpj(int cnpj) throws Exception;
}
