package br.com.crudsimples.adapters.outbounds.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.UUID;

@Data
@NoArgsConstructor
@Entity
@Table(name = "tb_candidatos")
public class CandidatoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idCandidato;

    private String nome;

    private String email;

    private Double valorHora;


}
