package br.com.livresbs.livres.service.impl;

import java.util.List;

import br.com.livresbs.livres.model.Consumidor;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.*;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.support.AnnotationConfigContextLoader;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;

import br.com.livresbs.livres.controller.ConsumidorController;
import br.com.livresbs.livres.dto.ConsumidorDTO;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

import static org.junit.jupiter.api.Assertions.assertEquals;


//WebMvcTest -> Sobe o contexto da camada de web
//AutoConfigureMockMvc -> Sobe todo o contexto da aplicação


@ContextConfiguration(loader = AnnotationConfigContextLoader.class)
@ExtendWith(SpringExtension.class)
@WebMvcTest(ConsumidorImpl.class)
public class ConsumidorImplTest {


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
		
		//Assert.assertTrue(new ReflectionEquals(consumidordTO).matches(actual));

		assertEquals(consumidordTO, actual);
	}

}
