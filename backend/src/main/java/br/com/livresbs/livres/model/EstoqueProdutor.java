package br.com.livresbs.livres.model;

import java.math.BigDecimal;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "tb_estoque_produtor")
@Getter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class EstoqueProdutor {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	
	@NotBlank
	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produto;
	
	@NotBlank
	@ManyToOne
	@JoinColumn(name = "produtor_id")
	private Produtor produtor;
	
	@NotBlank
	@ManyToOne
	@JoinColumn(name = "unidademedida_id")
	private UnidadeMedida unidadeMedida;
	
	@NotBlank
	private Integer quantidade;
	
	@NotBlank
	private BigDecimal preco;

	@ManyToMany(mappedBy = "estoques")
	private List<DataEntrega> datasEntrega;

}
