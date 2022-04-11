package br.com.crudsimples.application.core.domain;

import java.util.UUID;

public class Candidato {

    private UUID idCandidato;

    private String nome;

    private String email;

    private Double valorHora;

    @Deprecated
    public Candidato() {

    }

    public UUID getIdCandidato() {
        return idCandidato;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }
}
