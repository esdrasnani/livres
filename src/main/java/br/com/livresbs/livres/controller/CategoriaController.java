package br.com.livresbs.livres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.livresbs.livres.model.CategoriaProduto;
import br.com.livresbs.livres.service.CategoriaService;


@RestController
@RequestMapping(value = "categoria")
public class CategoriaController {
    @Autowired
    private CategoriaService categoriaService;

    @CrossOrigin
    @GetMapping
    public List<CategoriaProduto> getCategorias() {
        return categoriaService.findAll();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public CategoriaProduto getCategoriaId(@PathVariable(value = "id") Integer id) {
        return categoriaService.listaCategoriaId(id);
    }

    @CrossOrigin
    @PutMapping
    public ResponseEntity<String> editaCategoria(@RequestBody CategoriaProduto categoria){
        return categoriaService.editaCategoria(categoria);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity<String> cadastraCategoria(@RequestBody CategoriaProduto categoria) {
        return categoriaService.cadastraCategoria(categoria);
    }

    @CrossOrigin
    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletaConsumidor(@PathVariable(value = "id") Integer id) {
        return categoriaService.deletarCategoria(id);
    }

}
