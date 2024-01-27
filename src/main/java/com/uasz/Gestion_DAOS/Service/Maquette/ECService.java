package com.uasz.Gestion_DAOS.Service.Maquette;

import com.uasz.Gestion_DAOS.Model.Maquette.EC;
import com.uasz.Gestion_DAOS.Repository.Maquette.ECRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class ECService {
    @Autowired
    private ECRepository ecRepository;
    public void ajouterEC(EC ec){
        ecRepository.save(ec);
    }
    public List<EC> afficherToutEC(){
        return ecRepository.findAll();
    }
    public EC afficherEC(Long id){
        return ecRepository.getById(id);
    }

   public void modifierEC(EC ec){
        EC ecUpdate=ecRepository.getById(ec.getId());
        ecUpdate.setCode(ec.getCode());
        ecUpdate.setLibelle(ec.getLibelle());
        ecUpdate.setCM(ec.getCM());
        ecUpdate.setTD(ec.getTD());
        ecUpdate.setTP(ec.getTP());
        ecUpdate.setTPE(ec.getTPE());
        ecUpdate.setCumulcmtdtp(ec.getCumulcmtdtp());
       ecUpdate.setVHT(ec.getVHT());
        ecUpdate.setCoefficient(ec.getCoefficient());
        //ecUpdate.setDescription(ec.getDescription());
        ecUpdate.setUe(ec.getUe());
        ecRepository.save(ecUpdate);
    }
    public void supprimerEC(EC ec){
        ecRepository.delete(ec);
    }

}
