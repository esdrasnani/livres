package br.com.livresbs.livres;

<<<<<<< Updated upstream
import org.junit.jupiter.api.Test;


//@SpringBootTest
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@ContextConfiguration
//@PropertySource("application.properties")
=======

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.codehaus.jackson.map.ObjectMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.web.servlet.MockMvc;

import br.com.livresbs.livres.controller.ConsumidorController;
import br.com.livresbs.livres.dto.ConsumidorDTO;
import br.com.livresbs.livres.service.ConsumidorService;
import br.com.livresbs.livres.service.PreComunidadeService;

@SpringBootTest
@AutoConfigureMockMvc
@SuppressWarnings("rawtypes")
>>>>>>> Stashed changes
class LivresApplicationTests2 {

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
