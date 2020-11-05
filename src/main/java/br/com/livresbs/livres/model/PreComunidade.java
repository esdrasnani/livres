package br.com.livresbs.livres.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "tb_precomunidade")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PreComunidade {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank
    private String Nome;

    @OneToMany(mappedBy = "precomunidade")
    @JsonManagedReference
    private List<Consumidor> consumidores;
    
}
