package br.com.livresbs.livres.model;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "tb_usuario")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
public class Usuario implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
	@NotBlank
	private String login;
    @NotBlank
    @JsonIgnore
    private String senha;

	@ElementCollection(fetch = FetchType.EAGER)
	@CollectionTable(name = "tb_perfil")
	private Set<Integer> perfis = new HashSet<>();

	public Set<TipoPerfil> getPerfis() {
		return perfis.stream()
				.map(x -> TipoPerfil.toEnum(x))
				.collect(Collectors.toSet());
	}
	public void addPerfil(TipoPerfil perfil) {
		this.perfis.add(perfil.getCod());
	}


	public String getLogin() { return login; }
    public void setLogin(String login) {  this.login = login;}
    
    @JsonIgnore
    public String getSenha() { return senha; }
    @JsonProperty
    public void setSenha(String senha) {this.senha = senha;}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
}
