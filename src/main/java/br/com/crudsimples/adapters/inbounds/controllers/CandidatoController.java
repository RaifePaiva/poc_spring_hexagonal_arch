package br.com.crudsimples.adapters.inbounds.controllers;

import br.com.crudsimples.adapters.inbounds.mappers.CandidatoRequestToCandidato;
import br.com.crudsimples.adapters.inbounds.requests.CandidatoRequest;
import br.com.crudsimples.application.ports.in.SalvarCandidatoPortIn;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/candidatos")
public class CandidatoController {

    private final SalvarCandidatoPortIn salvarCandidatoPortIn;

    public CandidatoController(SalvarCandidatoPortIn salvarCandidatoPortIn) {
        this.salvarCandidatoPortIn = salvarCandidatoPortIn;
    }

    @GetMapping
    public ResponseEntity<String> testHello(){
        return ResponseEntity.ok().body("Hello hexagonal");
    }

    @PostMapping
    public ResponseEntity<?> salvarCandidato(@RequestBody CandidatoRequest candidatoRequest){
        var candidato = CandidatoRequestToCandidato.INSTANCE.convert(candidatoRequest);
        salvarCandidatoPortIn.salvarCandidato(candidato);
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

}
