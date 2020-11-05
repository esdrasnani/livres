package br.com.livresbs.livres.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class MetodoPagamentoDTO {

    private String nome;
    private List<String> meiosPagamento;

}
