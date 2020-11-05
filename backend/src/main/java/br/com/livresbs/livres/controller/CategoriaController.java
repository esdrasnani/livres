package br.com.livresbs.livres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.livresbs.livres.model.CategoriaProduto;
import br.com.livresbs.livres.service.CategoriaService;


@RestController
@RequestMapping(value = "categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @GetMapping
    public List<CategoriaProduto> getCategorias() {
        return categoriaService.findAll();
    }

    @GetMapping("/{id}")
    public CategoriaProduto getCategoriaId(@PathVariable(value = "id") Integer id) {
        return categoriaService.listaCategoriaId(id);
    }

    @PutMapping
    public ResponseEntity<String> editaCategoria(@RequestBody CategoriaProduto categoria){
        return categoriaService.editaCategoria(categoria);
    }


    @PostMapping
    public ResponseEntity<String> cadastraCategoria(@RequestBody CategoriaProduto categoria) {
        return categoriaService.cadastraCategoria(categoria);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletaConsumidor(@PathVariable(value = "id") Integer id) {
        return categoriaService.deletarCategoria(id);
    }

}
