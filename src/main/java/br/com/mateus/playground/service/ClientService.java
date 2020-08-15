package br.com.mateus.playground.service;

import br.com.mateus.playground.model.Client;
import br.com.mateus.playground.repository.ClientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClientService {

    @Autowired
    private ClientRepository clientRepository;

    public void saveUser() {
        clientRepository.save(Client.builder().name("Nome").build());
    }
}
