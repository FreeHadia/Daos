package com.uasz.Gestion_DAOS.Repository.Maquette;
import com.uasz.Gestion_DAOS.Model.Maquette.EC;
import com.uasz.Gestion_DAOS.Model.Maquette.UE;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ECRepository extends JpaRepository<EC, Long> {

}
