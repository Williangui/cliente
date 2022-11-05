package com.willian.cliente.model.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ClienteFiltrosDTO {

    private Long id;
    private String nome;

    public String getNome() {
        if (nome == null) {
            nome = "";
        }
        return nome;
    }
}
