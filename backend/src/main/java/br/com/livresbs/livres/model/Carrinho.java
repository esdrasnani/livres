package br.com.livresbs.livres.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Data;

@Entity
@Data
public class Carrinho {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    private Integer quantidade;

    @ManyToOne
    @JoinColumn(name = "estoqueprodutor_id")
    private EstoqueProdutor estoqueProdutor;

    @ManyToOne
    @JoinColumn(name = "consumidor_id")
    private Consumidor consumidor;

}
