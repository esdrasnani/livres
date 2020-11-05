package br.com.livresbs.livres.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.livresbs.livres.model.MetodoPagamento;

public interface MetodoPagamentoRepository extends JpaRepository<MetodoPagamento, Integer> {}
