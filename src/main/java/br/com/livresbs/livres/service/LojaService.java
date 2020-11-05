package br.com.livresbs.livres.service;

import java.util.List;

import br.com.livresbs.livres.dto.ProdutosDisponiveisDTO;

public interface LojaService {

        ProdutosDisponiveisDTO listarProdutosDisponiveisCompraConsumidor(String cpf, Integer pagina, List<String> categorias);

}
