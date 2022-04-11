package br.com.crudsimples.adapters.outbounds.repositories;

import br.com.crudsimples.adapters.outbounds.entities.CandidatoEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface CandidatoRepository extends JpaRepository<CandidatoEntity, UUID> {
}
