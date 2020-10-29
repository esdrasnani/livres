package br.com.livresbs.livres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.livresbs.livres.dto.ProdutoDTO;
import br.com.livresbs.livres.model.Produto;
import br.com.livresbs.livres.service.ProdutoService;

@RestController
@CrossOrigin
@RequestMapping(value="produto")
public class ProdutoController {

    @Autowired
    private ProdutoService produtoService;


    @PostMapping
    public ResponseEntity<String> cadastraProduto(@RequestBody ProdutoDTO produto) {
    	return produtoService.cadastrar(produto);
    }

    @GetMapping
    public List<ProdutoDTO> listaProdutos() {
        return produtoService.listaProdutos();
    }

    @GetMapping("/{id}")
    public ProdutoDTO listaProdutoId(@PathVariable(value = "id") Integer id) {
        return produtoService.listaProdutoId(id);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<String> deletaProduto(@PathVariable(value = "id") Integer id){
        return produtoService.deletarProduto(id);
    }
    
    @PutMapping
    public Produto editaProduto(@RequestBody Produto produto) {
    	return produtoService.editar(produto);
    }


}
