package br.com.crudsimples.adapters.inbounds.mappers;

import br.com.crudsimples.adapters.inbounds.requests.CandidatoRequest;
import br.com.crudsimples.application.core.domain.Candidato;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class CandidatoRequestToCandidato {

    public static final CandidatoRequestToCandidato INSTANCE = Mappers.getMapper(CandidatoRequestToCandidato.class);

    @Mapping(source = "nome", target = "nome")
    public abstract Candidato convert(CandidatoRequest candidatoRequest);

}
