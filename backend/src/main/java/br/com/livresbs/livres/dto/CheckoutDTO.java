package br.com.livresbs.livres.dto;

import java.math.BigDecimal;
import java.util.List;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class CheckoutDTO {

    private List<ProdutoCompradoDTO> produtos;
    private BigDecimal valorTotal;
    private List<MetodoPagamentoDTO> metodosPagamento;

}
