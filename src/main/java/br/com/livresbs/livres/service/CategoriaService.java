package br.com.livresbs.livres.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.livresbs.livres.model.CategoriaProduto;

@Service
public interface CategoriaService {
    List<CategoriaProduto> findAll();

    ResponseEntity<String> cadastraCategoria(@RequestBody CategoriaProduto cat);

    ResponseEntity<String> deletarCategoria(Integer id);

    CategoriaProduto listaCategoriaId(Integer id);

    ResponseEntity<String> editaCategoria(CategoriaProduto categoria);
};

