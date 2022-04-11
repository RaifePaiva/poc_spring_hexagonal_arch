package br.com.crudsimples.adapters.inbounds.requests;

import lombok.*;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CandidatoRequest {

    private String nome;

    private String email;

    private Double valorHora;

}
