package com.uasz.Gestion_DAOS.Model.Maquette;

import com.uasz.Gestion_DAOS.Model.Utilisateur.Utilisateur;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String libelle;
    private String cours;
    private int duree;
    private String objectif;
    private String description;
    private String dateCreation;
    @ManyToOne
    private UE ue;
}
