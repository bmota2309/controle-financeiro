package br.com.aplicacaofinanceira.controlefinanceiro.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "tb_recebido")
public class Recebido {
	
	@Id
	@Column(name = "id_recebido")
	private Long idRecebido;
	@Column(name = "tipo_recebimento")
	private String tipoRecebimento;
	@Column(name = "descricao_receimento")
	private String descricaoRecebimento;
	@Column(name="data_recebimento")
	private Date dataRecebimento;

}
