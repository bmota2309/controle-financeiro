package br.com.aplicacaofinanceira.controlefinanceiro.entities;

import java.math.BigDecimal;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_gasto")
public class Gasto {
	
	
	@Id
	@Column(name="id_gasto")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idGasto;
	@Column(name= "descricao_gasto")
	private String descricaoGasto;
	@Column(name= "valor_gasto")
	private BigDecimal valorGasto;
	@Column(name= "data_gasto")
	private Date dataGasto;
	@ManyToOne
	@JoinColumn(name = "id_conta")
	private Conta conta;

}
