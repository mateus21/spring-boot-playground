package br.com.mateus.playground;

import br.com.mateus.playground.model.Client;
import br.com.mateus.playground.repository.ClientRepository;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class PlaygroundApplicationTests {

	@Autowired
	private ClientRepository clientRepository;

	@Test
	void contextLoads() {
		clientRepository.save(Client.builder().name("Mateus").build());
	}

}
