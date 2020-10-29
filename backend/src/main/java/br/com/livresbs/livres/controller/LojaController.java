package br.com.livresbs.livres.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.livresbs.livres.dto.CarrinhoDTO;
import br.com.livresbs.livres.dto.CheckoutDTO;
import br.com.livresbs.livres.dto.ProdutoCarrinhoDTO;
import br.com.livresbs.livres.dto.ProdutosDisponiveisDTO;
import br.com.livresbs.livres.service.CarrinhoService;
import br.com.livresbs.livres.service.LojaService;
import br.com.livresbs.livres.service.PedidoService;

@RestController
@CrossOrigin
@RequestMapping("/loja")
public class LojaController {

    @Autowired
    private LojaService lojaService;

    @Autowired
    private CarrinhoService carrinhoService;

    @Autowired
    private PedidoService pedidoService;

    @GetMapping("/produtos")
    public ProdutosDisponiveisDTO getProdutosDisponiveisVendaByCategoria (
            @RequestHeader(value = "cpf") String cpf,
            @RequestParam(value = "pagina", required = false) Integer numeroPagina,
            @RequestParam(value = "categorias", required = false) List<String> categorias
    ) {

        if (numeroPagina == null || numeroPagina < 1)
            numeroPagina = 1;

        return lojaService.listarProdutosDisponiveisCompraConsumidor(cpf, numeroPagina, categorias);

    }

    @PostMapping("/carrinhos")
    public void sincronizarProduto(
            @RequestHeader(value = "cpf") String cpf,
            @Valid @RequestBody ProdutoCarrinhoDTO produtoCarrinhoDTO
    ) {
        carrinhoService.sincronizarProduto(
                cpf,
                produtoCarrinhoDTO.getEstoqueProdutorId(),
                produtoCarrinhoDTO.getQuantidade()
        ) ;
    }

    @GetMapping("/carrinhos")
    public CarrinhoDTO listarCarrinhos(
            @RequestHeader(value = "cpf") String cpf
    ) {

        CarrinhoDTO carrinhoDTO = carrinhoService.listarCarrinhos(cpf);
        return carrinhoDTO;

    }

    @GetMapping("/pedidos")
    public CheckoutDTO checkout(@RequestHeader("cpf") String cpf) {
        return pedidoService.checkout(cpf);
    }

}
