package br.com.aplicacaofinanceira.controlefinanceiro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import br.com.aplicacaofinanceira.controlefinanceiro.controllers.TestController;
import br.com.aplicacaofinanceira.controlefinanceiro.entities.EntityTest;
import br.com.aplicacaofinanceira.controlefinanceiro.repositories.TestRepository;

@SpringBootApplication
@EnableJpaRepositories(basePackageClasses= {TestRepository.class})
public class ControlefinanceiroApplication {

	public static void main(String[] args) {
		SpringApplication.run(ControlefinanceiroApplication.class, args);
	}

}
