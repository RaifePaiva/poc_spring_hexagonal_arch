package br.com.crudsimples.adapters.outbounds;

import br.com.crudsimples.adapters.outbounds.entities.CandidatoEntity;
import br.com.crudsimples.adapters.outbounds.repositories.CandidatoRepository;
import br.com.crudsimples.application.ports.out.SalvarCandidatoPortOut;
import org.springframework.stereotype.Component;

@Component
public class SalvarCandidatoAdapter implements SalvarCandidatoPortOut {

    private final CandidatoRepository candidatoRepository;

    public SalvarCandidatoAdapter(CandidatoRepository candidatoRepository) {
        this.candidatoRepository = candidatoRepository;
    }

    @Override
    public void salvarCandidato(CandidatoEntity candidatoEntity) {
        candidatoRepository.save(candidatoEntity);
    }
}
