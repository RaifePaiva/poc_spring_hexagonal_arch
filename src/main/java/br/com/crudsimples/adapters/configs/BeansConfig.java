package br.com.crudsimples.adapters.configs;

import br.com.crudsimples.application.core.services.SalvarCandidatoUseCase;
import br.com.crudsimples.application.ports.out.SalvarCandidatoPortOut;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeansConfig {

    @Bean
    public SalvarCandidatoUseCase salvarCandidatoUseCase(SalvarCandidatoPortOut salvarCandidatoPortOut){
        return new SalvarCandidatoUseCase(salvarCandidatoPortOut);
    }



}
