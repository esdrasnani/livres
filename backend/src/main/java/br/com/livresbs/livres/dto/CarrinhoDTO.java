package br.com.livresbs.livres.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CarrinhoDTO {

    public List<ProdutoCarrinhoDTO> produtos;
}
