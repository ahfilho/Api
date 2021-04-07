package br.com.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.model.Empresa;

public interface Repository extends JpaRepository<Empresa, Long> {

	Empresa findByNome(String nome);

	Empresa findByCnpj(int cnpj);

}
