package br.com.livresbs.livres.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
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
    
    public String getLogin() { return login; }
    public void setLogin(String login) {  this.login = login;}
    
    @JsonIgnore
    public String getSenha() { return senha; }
    @JsonProperty
    public void setSenha(String senha) {this.senha = senha;}
}
