package br.com.aplicacaofinanceira.controlefinanceiro.models;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import br.com.aplicacaofinanceira.controlefinanceiro.entities.Conta;
import br.com.aplicacaofinanceira.controlefinanceiro.entities.Recebido;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carteira {
	private BigDecimal valorGuardado;
	private List<Conta> contas = new ArrayList<>();
	private List<Recebido> recebidos = new ArrayList<>();
	
}
