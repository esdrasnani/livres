package br.com.livresbs.livres.service.impl;

import java.util.List;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.mockito.internal.matchers.apachecommons.ReflectionEquals;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.livresbs.livres.controller.ConsumidorController;
import br.com.livresbs.livres.dto.ConsumidorDTO;


//WebMvcTest -> Sobe o contexto da camada de web
//AutoConfigureMockMvc -> Sobe todo o contexto da aplicação


@RunWith(SpringRunner.class)
@WebMvcTest(controllers = ConsumidorController.class)
public class ConsumidorImplTest {

	@Autowired
	private MockMvc mockMvc;
	
	@Test
	public void testConsumidorController() throws Exception {
		MvcResult result = mockMvc
				.perform(MockMvcRequestBuilders.get("/consumidor"))
				.andExpect(MockMvcResultMatchers.status().isOk())
				.andReturn();
		
		ObjectMapper mapper = new ObjectMapper();
		
		List<ConsumidorDTO> actual = mapper.readValue(result.getResponse().getContentAsString(), new TypeReference<List<ConsumidorDTO>>() {});
		
		ConsumidorImpl cl = new ConsumidorImpl();
		List<ConsumidorDTO> consumidordTO = cl.listarConsumidor();
		
		Assert.assertTrue(new ReflectionEquals(consumidordTO).matches(actual));
		
	}

}
