package br.com.aplicacaofinanceira.controlefinanceiro.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.aplicacaofinanceira.controlefinanceiro.entities.Conta;
import br.com.aplicacaofinanceira.controlefinanceiro.repositories.ContaRepository;

@Service
public class ContaService {
	
	@Autowired
	ContaRepository contaRepository;
	
	public void inserirConta(@RequestBody Conta conta) {
		contaRepository.save(conta);
	}

}
