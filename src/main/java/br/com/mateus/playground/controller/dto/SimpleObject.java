package br.com.mateus.playground.controller.dto;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class SimpleObject {
    private String nome;
    private Integer number;
}
