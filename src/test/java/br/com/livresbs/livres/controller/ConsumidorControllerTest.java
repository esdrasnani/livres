package br.com.livresbs.livres.controller;

import br.com.livresbs.livres.dto.ConsumidorDTO;
import br.com.livresbs.livres.service.impl.ConsumidorImpl;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.restdocs.AutoConfigureRestDocs;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureWebMvc;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.TestPropertySource;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.web.context.WebApplicationContext;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ActiveProfiles("test")
@WebMvcTest(ConsumidorController.class)
class ConsumidorControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Autowired
    WebApplicationContext wac;

    @Test
    public void listarConsumidor() throws Exception{
        MvcResult result = mockMvc
                .perform(MockMvcRequestBuilders.get("http://localhost:8080/consumidor"))
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