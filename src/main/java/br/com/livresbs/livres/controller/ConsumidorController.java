package br.com.livresbs.livres.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.livresbs.livres.dto.ConsumidorDTO;
import br.com.livresbs.livres.model.Consumidor;
import br.com.livresbs.livres.service.ConsumidorService;
@SuppressWarnings("rawtypes")
@RestController // controlador rest
@RequestMapping(value = "consumidor") //caminho
public class ConsumidorController {

    @Autowired
    private ConsumidorService cons;

    @CrossOrigin // quando tenho duas tec conversando em dif servidores... estabele contrato de comunicacao..
    @GetMapping
    public List<ConsumidorDTO> listarConsumidor() {
        return cons.listarConsumidor();
    }

    @CrossOrigin
    @GetMapping("/{id}")
    public Consumidor listaConsumidorUnico(@PathVariable(value = "id") String id) {
        return cons.listaConsumidorUnico(id);
    }

    @CrossOrigin
    @PutMapping
    public ResponseEntity<String> editaConsumidor(@RequestBody ConsumidorDTO consumidor){
        return cons.editaConsumidor(consumidor);
    }

    @CrossOrigin
    @PostMapping
    public ResponseEntity cadastraConsumidor(@RequestBody ConsumidorDTO con) { return cons.cadastraConsumidor(con); }
    
    @CrossOrigin
    @DeleteMapping("/{id}")
    public void deletaConsumidor(@PathVariable(value = "id") String id) {
    	cons.deletarConsumidor(id);
    }
}
