package br.com.crudsimples.application.ports.out;

import br.com.crudsimples.adapters.outbounds.entities.CandidatoEntity;

public interface SalvarCandidatoPortOut {

    void salvarCandidato(CandidatoEntity candidatoEntity);

}
