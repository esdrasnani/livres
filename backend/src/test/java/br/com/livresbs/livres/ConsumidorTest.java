package br.com.livresbs.livres;

import br.com.livresbs.livres.controller.ConsumidorController;
import br.com.livresbs.livres.dto.ConsumidorDTO;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SuppressWarnings("rawtypes")
@SpringBootTest
public class ConsumidorTest {

    @Autowired
    private ConsumidorDTO consumidorDTO;

    @Autowired
    ConsumidorController cc;

    @Test
    void cadastrarCPFRepetidoRetornaErro() throws Exception {

		consumidorDTO.setCpf("47521586808");
		consumidorDTO.setNome("Esdras");
		consumidorDTO.setSobrenome("Nani");
		consumidorDTO.setPrecomunidade(consumidorDTO.getPrecomunidade());
		consumidorDTO.setSenha("1234");


		ResponseEntity test = cc.cadastraConsumidor(consumidorDTO);

		assertEquals(test, ResponseEntity.status(HttpStatus.OK).body("Cadastrado com Sucesso!"));
    }
}
