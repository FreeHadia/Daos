package com.uasz.Gestion_DAOS.Model.Repartition;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data @NoArgsConstructor @AllArgsConstructor
@DiscriminatorValue("VAC")
public class Vacataire  extends Enseignant{
    private String specialite;
}
