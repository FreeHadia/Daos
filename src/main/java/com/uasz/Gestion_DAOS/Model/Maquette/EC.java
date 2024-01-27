package com.uasz.Gestion_DAOS.Model.Maquette;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
public class EC {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String code;
    private String libelle;
    private int CM;
    private int TD;
    private int TP;
    private int TPE;
    private int cumulcmtdtp;
    private int VHT;
    private int coefficient;
   // private String description;
    @ManyToOne
    private UE ue;
  /*  @OneToMany(mappedBy = "ec")
    private Collection<Module> modules;*/


}
