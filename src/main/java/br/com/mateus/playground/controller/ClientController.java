package br.com.mateus.playground.controller;

import br.com.mateus.playground.controller.dto.SimpleObject;
import br.com.mateus.playground.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/main")
public class ClientController {

    @Autowired
    private ClientService clientService;

    @GetMapping("/")
    private SimpleObject getClient() {

        return SimpleObject.builder()
                .nome("Mateus Mantovani")
                .number(10)
                .build();
    }

    @PostMapping("/")
    private void postClient() {
        clientService.saveUser();
    }

}
