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

import org.modelmapper.ModelMapper;
import org.springframework.context.annotation.Bean;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_conta")
public class Conta {
		
	@Id
	@Column(name="id_conta")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long idConta;
	@Column(name= "nome_conta")
	private String nomeConta;
	@Column(name= "total_gasto")
	private BigDecimal totalConta;
	@Column(name= "vencimento_conta")
	private Date vencimentoConta;
	@ManyToOne
	@JoinColumn(name = "id_tipo_conta")
	private TipoConta tipoConta;
	
	@Bean
	public ModelMapper modelMapper() {
	    return new ModelMapper();
	}
}
