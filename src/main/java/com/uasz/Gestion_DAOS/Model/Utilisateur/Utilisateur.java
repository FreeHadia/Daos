package com.uasz.Gestion_DAOS.Model.Utilisateur;

import com.uasz.Gestion_DAOS.Model.Maquette.UE;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Entity
@Data @AllArgsConstructor @NoArgsConstructor
public class Utilisateur {
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    private String prenom;
    private String role;
    @OneToMany(mappedBy = "utilisateur")
    private List<UE> ues;
}
