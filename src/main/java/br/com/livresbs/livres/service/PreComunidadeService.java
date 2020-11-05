package br.com.livresbs.livres.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.livresbs.livres.model.PreComunidade;

public interface PreComunidadeService {

    List<PreComunidade> listaPreComunidades();

    PreComunidade listaPreComunidadeUnica(@PathVariable(value = "id") long id);

    PreComunidade cadastraPreComunidade(@RequestBody PreComunidade pc);
    
    PreComunidade editaPreComunidade(@RequestBody PreComunidade pc);

    ResponseEntity<String> excluiPreComunidade(long id);
}
