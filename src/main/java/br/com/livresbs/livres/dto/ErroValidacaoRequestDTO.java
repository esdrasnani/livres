package br.com.livresbs.livres.dto;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErroValidacaoRequestDTO {

    private List<ErroCampoRequestDTO> body;
    private ErroCampoRequestDTO header;
    private ErroCampoRequestDTO param;

}
