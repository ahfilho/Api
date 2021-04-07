package br.com.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "empresa")

public class Empresa {

	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@NotBlank(message = "nome é obrigatório")
	@Column(name = "nome")
	private String nome;

	@NotBlank(message = "segmento é obrigatório")
	@Column(name = "segmento")
	private String segmento;

	@Min(value = 10, message = "não pode ser menor que 10")
	@Column(name = "cnpj")
	private int cnpj;

	@Email
	@Column(name = "email")
	private String email;

}
