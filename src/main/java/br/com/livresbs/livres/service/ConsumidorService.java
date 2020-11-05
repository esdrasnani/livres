package br.com.livresbs.livres.service;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import br.com.livresbs.livres.dto.ConsumidorDTO;
import br.com.livresbs.livres.model.Consumidor;

@SuppressWarnings("rawtypes")
@Service
public interface ConsumidorService {
	
    List<ConsumidorDTO> listarConsumidor();
    Consumidor listaConsumidorUnico(@PathVariable(value = "id") String id);
    ResponseEntity cadastraConsumidor(@RequestBody ConsumidorDTO con);
    void deletarConsumidor(@PathVariable(value = "id") String id);

    ResponseEntity<String> editaConsumidor(ConsumidorDTO consumidor);
}
