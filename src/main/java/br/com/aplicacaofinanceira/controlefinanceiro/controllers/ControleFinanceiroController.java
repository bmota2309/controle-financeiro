package br.com.aplicacaofinanceira.controlefinanceiro.controllers;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.aplicacaofinanceira.controlefinanceiro.entities.Conta;
import br.com.aplicacaofinanceira.controlefinanceiro.services.ContaService;
import io.swagger.annotations.Api;

@RestController
@RequestMapping(value = "/controle/financeiro", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = "Endpoint para gestão financeira", produces = "application/json;charset=UTF-8", protocols = "http, https")
public class ControleFinanceiroController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ControleFinanceiroController.class);
	
	@Autowired
	ContaService contaService;
	
	@PostMapping("/adicionarconta")
	@ResponseStatus(HttpStatus.CREATED)
	public void adicionarConta(Conta conta) {
		LOGGER.info("INFO - INICIANDO INSERÇÃO DE CONTA!");
		contaService.inserirConta(conta);
		
	}
}
