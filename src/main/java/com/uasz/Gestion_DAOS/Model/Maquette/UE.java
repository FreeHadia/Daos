package com.uasz.Gestion_DAOS.Model.Maquette;

import com.uasz.Gestion_DAOS.Model.Utilisateur.Utilisateur;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.util.Collection;
import java.util.List;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class UE {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String libelle;
    private int credit;
    private int coefficient;

    @ManyToOne
    private Utilisateur utilisateur;
    @OneToMany(mappedBy="ue")
    private Collection<EC> ecs;
    @OneToMany(mappedBy="ue")
    private Collection<Module> modules;

}
