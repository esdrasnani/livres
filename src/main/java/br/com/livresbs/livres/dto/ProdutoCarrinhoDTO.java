package br.com.livresbs.livres.dto;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class ProdutoCarrinhoDTO {

    @NotNull
    private Integer estoqueProdutorId;

    @NotNull
    @Min(0)
    private Integer quantidade;

}
