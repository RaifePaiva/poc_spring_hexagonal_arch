package br.com.crudsimples.adapters.inbounds.mappers;

import br.com.crudsimples.adapters.outbounds.entities.CandidatoEntity;
import br.com.crudsimples.application.core.domain.Candidato;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper(componentModel = "spring")
public abstract class CandidatoToCandidatoEntityMapper {

    public static final CandidatoToCandidatoEntityMapper INSTANCE = Mappers.getMapper(CandidatoToCandidatoEntityMapper.class);

    @Mapping(source = "nome", target = "nome")
    public abstract CandidatoEntity convert(Candidato candidato);

}
