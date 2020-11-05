package br.com.livresbs.livres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livresbs.livres.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
	Usuario findByLogin(String login);
}
