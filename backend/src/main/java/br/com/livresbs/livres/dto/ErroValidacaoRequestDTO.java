package br.com.livresbs.livres.dto;

<<<<<<< Updated upstream
import java.util.List;

=======
>>>>>>> Stashed changes
import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Builder;
import lombok.Data;

<<<<<<< Updated upstream
=======
import java.util.List;

>>>>>>> Stashed changes
@Data
@Builder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErroValidacaoRequestDTO {

    private List<ErroCampoRequestDTO> body;
    private ErroCampoRequestDTO header;
    private ErroCampoRequestDTO param;

}
