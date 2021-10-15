package br.com.aplicacaofinanceira.controlefinanceiro.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_tipo_conta")
public class TipoConta {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name="id_tipo_conta")
	private Long idTipoConta;
	@Column(name="descricao_conta")
	private String descricaoConta;

}
