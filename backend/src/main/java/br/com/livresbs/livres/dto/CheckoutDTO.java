package br.com.livresbs.livres.dto;

<<<<<<< Updated upstream
import java.math.BigDecimal;
import java.util.List;

import lombok.Builder;
import lombok.Data;
=======
import lombok.Builder;
import lombok.Data;

import java.math.BigDecimal;
import java.util.List;
>>>>>>> Stashed changes

@Data
@Builder
public class CheckoutDTO {

    private List<ProdutoCompradoDTO> produtos;
    private BigDecimal valorTotal;
    private List<MetodoPagamentoDTO> metodosPagamento;

}
