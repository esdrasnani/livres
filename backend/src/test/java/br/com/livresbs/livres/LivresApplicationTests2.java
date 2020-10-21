package br.com.livresbs.livres;

import br.com.livresbs.livres.controller.ConsumidorController;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.netty.handler.codec.http.HttpResponse;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.PropertySource;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.livresbs.livres.dto.ConsumidorDTO;
import br.com.livresbs.livres.model.PreComunidade;
import br.com.livresbs.livres.service.ConsumidorService;
import br.com.livresbs.livres.service.PreComunidadeService;
import org.springframework.test.web.servlet.MockMvc;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;


@SpringBootTest
@AutoConfigureMockMvc
@PropertySource("application.properties")
class LivresApplicationTests2 {

	@Autowired
	private ConsumidorService consumidorService;

	@Autowired
	private PreComunidadeService pcService;

	@Autowired
	private MockMvc mockMvc;

	@Autowired
	private ObjectMapper objectMapper;

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




		mockMvc.perform(post("/consumidor")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(consumidorDTO)))
				.andExpect(status().isOk());

		ResponseEntity test = cc.cadastraConsumidor(consumidorDTO);

		assertEquals(test, ResponseEntity.status(HttpStatus.OK).body("Cadastrado com Sucesso!"));
	}

}
