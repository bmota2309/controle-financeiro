package br.com.aplicacaofinanceira.controlefinanceiro.dto;

import java.math.BigDecimal;
import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContaDTO {

	private Long idConta;
	private String nomeConta;
	private BigDecimal totalConta;
	private Date vencimentoConta;
	private Long idTipoConta;
	
}
