package com.uasz.Gestion_DAOS.Repository.Maquette;

import com.uasz.Gestion_DAOS.Model.Maquette.EC;
import com.uasz.Gestion_DAOS.Model.Maquette.UE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public interface UERepository extends JpaRepository <UE, Long>{
    @Query("SELECT e FROM EC e WHERE e.ue= ?1")
    List<EC> findByUE(UE ue);

}
