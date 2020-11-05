package br.com.livresbs.livres.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_data_entrega")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class DataEntrega {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "precomunidade_id")
	private PreComunidade precomunidade;
	
	@NotNull
	@Column(columnDefinition = "DATE")
	private LocalDate prazo;
	
	@NotNull
	@Column(columnDefinition = "DATE")
	private LocalDate prazoLimitePedido;

	@Enumerated(EnumType.ORDINAL)
	private StatusDataEntrega status = StatusDataEntrega.NAO_ATIVA;

	@ManyToMany
	@JoinTable(
			name = "dataentrega_estoqueprodutor",
			joinColumns = @JoinColumn(name = "dataentrega_id"),
			inverseJoinColumns = @JoinColumn(name = "estoqueprodutor_id")
	)
	private List<EstoqueProdutor> estoques;
	
}
