package br.com.aplicacaofinanceira.controlefinanceiro.controllers;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.aplicacaofinanceira.controlefinanceiro.entities.Conta;
import br.com.aplicacaofinanceira.controlefinanceiro.entities.EntityTest;
import br.com.aplicacaofinanceira.controlefinanceiro.repositories.TestRepository;
import br.com.aplicacaofinanceira.controlefinanceiro.services.ContaService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping(value = "/teste", produces = MediaType.APPLICATION_JSON_VALUE)
@Api(tags = "Retorna os dados teste", produces = "application/json;charset=UTF-8", protocols = "http, https")
public class TestController {
	
	private static final Logger LOGGER = LoggerFactory.getLogger(TestController.class);
	
	@Autowired
	ContaService contaService;
	
	@Autowired
	TestRepository testRepository;
	
	@GetMapping("/buscar/{id}")
	@ApiOperation(value="Endpoint pra pegar por Id")
	public List<EntityTest> findByRepositiryTestId(@PathVariable("id") long id){
		return testRepository.findEntityTestById(id);
	}
	
	@GetMapping("/buscar")
	@ApiOperation(value="Endpoint pra pegar todos")
	public List<EntityTest> findAll(){
		LOGGER.info("INFO - Início da busca...");
		List<EntityTest> busca = null;
		try {
			busca = testRepository.findAll();
		}catch(Exception e){
				LOGGER.error("ERROR - Não foi possivel buscar resultados!");
			new Throwable("Não foi possivel buscar resultados!",e);
			}
		
		if(busca != null && !busca.isEmpty()) {
			return busca;
		}else{
			LOGGER.info("INFO - Não encontrado resultados!");
			new Throwable("Não foi encontrado nenhum registro!");
		}
		return busca;
	}
	
	@DeleteMapping("/excluir/{id}")
	@ApiOperation(value="Endpoint pra deletar por Id")
	public EntityTest deleteById(@PathVariable("id") long id){
		return testRepository.deleteById(id);
	}
	
	@PostMapping("/")
	@ResponseStatus(HttpStatus.CREATED)
	public void insertNewReg(@RequestBody EntityTest entityTest) {
		testRepository.save(entityTest);
	}
	
	@PostMapping("/adicionarconta")
	@ResponseStatus(HttpStatus.CREATED)
	public void adicionarConta(Conta conta) {
		contaService.inserirConta(conta);
	}
	
	
}
