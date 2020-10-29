package br.com.livresbs.livres.dto;

import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProdutosDisponiveisDTO {

    private List<ProdutoDisponivelDTO> produtos;
    private Integer paginaAtual;
    private Integer totalPaginas;

}
