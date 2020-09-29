package br.com.livresbs.livres.dto;
import lombok.Builder;
import lombok.Data;

import java.io.Serializable;

@Data
@Builder
public class EmailDTO implements Serializable {
    private static final long serialVersionUID = 1L;
    private String to;
    private String subject;
    private String text;

}