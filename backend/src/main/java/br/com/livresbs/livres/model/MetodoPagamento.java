package br.com.livresbs.livres.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class MetodoPagamento {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    String nome;

    @ManyToMany
    @JoinTable(
            name = "metodo_meio",
            joinColumns = @JoinColumn(name = "metodo_id"),
            inverseJoinColumns = @JoinColumn(name = "meio_id")
    )
    private List<MeioPagamento> meiosPagamento;

}
