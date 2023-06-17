package com.example.exo22.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class Annonce {
    public enum TypeAnnonce {
        IMMOBILIER, VEHICULE, EMPLOI,
    }

    @Id
    private String id;
    private String titre;
    private String description;
    private Long prix;
    @Enumerated(EnumType.STRING)
    private TypeAnnonce typeA;
}
