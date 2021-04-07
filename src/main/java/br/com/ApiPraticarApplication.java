package br.com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.model.Empresa;



@SpringBootApplication
public class ApiPraticarApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiPraticarApplication.class, args);
	}
	
    //validation
	//spring web
	//JPA
	//dev tools
	//H2
	//LOMBOK
	@RequestMapping("/home")
	public String hello() {
		return "Hello buddy!";
	}


}
