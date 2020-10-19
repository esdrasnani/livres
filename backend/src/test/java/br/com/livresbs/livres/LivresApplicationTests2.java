package br.com.livresbs.livres;

import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import br.com.livresbs.livres.dto.ConsumidorDTO;
import br.com.livresbs.livres.model.PreComunidade;
import br.com.livresbs.livres.service.ConsumidorService;
import br.com.livresbs.livres.service.PreComunidadeService;

@RunWith(SpringRunner.class)
@SpringBootTest
class LivresApplicationTests2 {

	@Autowired
	private ConsumidorService consumidorService;

	@Autowired
	private PreComunidadeService pcService;

	@Test
	void cadastrarCPFRepetidoRetornaErro() throws Exception {

		String cpf = "12345678978";
		String nome = "gabriel";
		String sobrenome = "jardim";
		String senha = "1234";
		PreComunidade pc = pcService.listaPreComunidadeUnica(1);
		ConsumidorDTO consumidor = new ConsumidorDTO(nome, sobrenome, cpf, senha, 1L);
		
		
		
		
		Assert.assertEquals(consumidorService.cadastraConsumidor(consumidor), 
				ResponseEntity.status(org.springframework.http.HttpStatus.CONFLICT).body("CPF já Cadastrado!"));
		
	}

}
