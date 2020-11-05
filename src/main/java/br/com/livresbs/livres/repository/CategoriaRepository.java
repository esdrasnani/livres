package br.com.livresbs.livres.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.livresbs.livres.model.CategoriaProduto;

@Repository
public interface CategoriaRepository extends JpaRepository<CategoriaProduto, Integer>{
    
}