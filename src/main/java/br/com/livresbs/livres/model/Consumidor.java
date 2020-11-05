package br.com.livresbs.livres.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_consumidor")
@Getter
@Setter
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Consumidor {

    @Id
    @NotBlank
    private String cpf;

    @NotBlank
    private String nome;
    @NotBlank
    private String sobrenome;
    @NotBlank
    @JsonIgnore
    private String senha;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "precomunidade")
    @NotNull
    @JsonBackReference
    private PreComunidade precomunidade;

    @ManyToMany
    @JoinTable(
        name = "consumidor_endereco",
        joinColumns = @JoinColumn(name = "consumidor_id"),
        inverseJoinColumns = @JoinColumn(name = "endereco_id")
    )
    private List<EnderecoEntrega> enderecos;

    
    
}
