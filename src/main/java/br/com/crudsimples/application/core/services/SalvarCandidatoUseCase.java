package br.com.crudsimples.application.core.services;

import br.com.crudsimples.adapters.inbounds.mappers.CandidatoToCandidatoEntityMapper;
import br.com.crudsimples.application.core.domain.Candidato;
import br.com.crudsimples.application.ports.in.SalvarCandidatoPortIn;
import br.com.crudsimples.application.ports.out.SalvarCandidatoPortOut;

public class SalvarCandidatoUseCase implements SalvarCandidatoPortIn {

    private final SalvarCandidatoPortOut salvarCandidatoPortOut;

    public SalvarCandidatoUseCase(SalvarCandidatoPortOut salvarCandidatoPortOut) {
        this.salvarCandidatoPortOut = salvarCandidatoPortOut;
    }

    @Override
    public void salvarCandidato(Candidato candidato) {
        System.out.println(candidato);
        var candidatoEntity = CandidatoToCandidatoEntityMapper.INSTANCE.convert(candidato);
        salvarCandidatoPortOut.salvarCandidato(candidatoEntity);
    }
}
