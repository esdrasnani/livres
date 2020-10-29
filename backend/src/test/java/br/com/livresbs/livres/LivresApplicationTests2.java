package br.com.livresbs.livres;

import org.junit.jupiter.api.Test;


//@SpringBootTest
//@RunWith(SpringRunner.class)
//@AutoConfigureMockMvc
//@ContextConfiguration
//@PropertySource("application.properties")
class LivresApplicationTests2 {

	//@Autowired
	//private ConsumidorService consumidorService;

	//@Autowired
	//private PreComunidadeService pcService;

	//@Autowired
	//private MockMvc mockMvc;

	//@Autowired
	//private ObjectMapper objectMapper;

	//@Autowired
	//private ConsumidorDTO consumidorDTO;

	//@Autowired
	//ConsumidorController cc;

	@Test
	void cadastrarCPFRepetidoRetornaErro() throws Exception {

		/*consumidorDTO.setCpf("47521586808");
		consumidorDTO.setNome("Esdras");
		consumidorDTO.setSobrenome("Nani");
		consumidorDTO.setPrecomunidade(consumidorDTO.getPrecomunidade());
		consumidorDTO.setSenha("1234");




		mockMvc.perform(post("/consumidor")
				.contentType("application/json")
				.content(objectMapper.writeValueAsString(consumidorDTO)))
				.andExpect(status().isOk());

		ResponseEntity test = cc.cadastraConsumidor(consumidorDTO);

		assertEquals(test, ResponseEntity.status(HttpStatus.OK).body("Cadastrado com Sucesso!"));*/
	}

}
