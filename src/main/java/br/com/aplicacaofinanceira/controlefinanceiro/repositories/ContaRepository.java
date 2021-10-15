package br.com.aplicacaofinanceira.controlefinanceiro.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import br.com.aplicacaofinanceira.controlefinanceiro.dto.ContaDTO;
import br.com.aplicacaofinanceira.controlefinanceiro.entities.Conta;

@Repository
public interface ContaRepository extends JpaRepository<Conta, Long>{
	
	Conta save(@Param("conta")ContaDTO contaDTO);

}
