package br.com.livresbs.livres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livresbs.livres.model.Consumidor;

public interface ConsumidorRepository extends JpaRepository<Consumidor, String> {
}
