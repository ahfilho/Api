package br.com.model;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.validation.constraints.Email;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;


@Getter
public class EmpresaDTO {
	
	private String nome;

	
	private String segmento;


	private String email;
	
	private int senha;
	
	
	public Empresa transformaParaObjeto() {
		return new Empresa(senha, nome,segmento,senha, email,false, senha);
		

	}
	}