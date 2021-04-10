package br.com.model;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor(access = AccessLevel.PRIVATE)
@Getter

public class EmpresaRespostaDTO {

	
	
	private Long id;
	private String nome;
	private String segmento;
	private int cnpj;
	private String email;
	private boolean admim;
	
	
	
	public static EmpresaRespostaDTO transformaEmDTO(Empresa empresa) {
		return new EmpresaRespostaDTO(empresa.getId(),empresa.getNome(), empresa.getSegmento(), empresa.getCnpj(), empresa.getEmail(), empresa.isAdmin());
	}
	
}
