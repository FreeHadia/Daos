package com.uasz.Gestion_DAOS.Service.Maquette;

import com.uasz.Gestion_DAOS.Model.Maquette.EC;
import com.uasz.Gestion_DAOS.Model.Maquette.UE;
import com.uasz.Gestion_DAOS.Repository.Maquette.ECRepository;
import com.uasz.Gestion_DAOS.Repository.Maquette.UERepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Transactional
public class UEService {
    @Autowired
    private UERepository ueRepository;
    @Autowired
    private ECService ecService;

    public void UERepository(UERepository ueRepository) {
        this.ueRepository = ueRepository;
    }
    public void ajouterUE(UE ue) {
        ueRepository.save(ue);
    }
    public List<UE> afficherToutUE() { return ueRepository.findAll();}
    
    public UE rechercherUE(Long id) {
        if (!ueRepository.findById(id).isPresent()) {
            return null;
        }
        return ueRepository.findById(id).get();
    }

    public UE afficherUE(Long id) { return ueRepository.getById(id);}

   public void modifierUE(UE ue){
        UE ueUpdate=ueRepository.getById(ue.getId());
        ueUpdate.setCode(ue.getCode());
        ueUpdate.setLibelle(ue.getLibelle());
        ueUpdate.setCredit(ue.getCredit());
        ueUpdate.setCoefficient(ue.getCoefficient());
        ueRepository.save(ueUpdate);
    }
    public void supprimerUE(UE ue) { ueRepository.delete(ue);}

    public List<EC> afficherLesEC(UE ue){
        // return ecService.afficherToutEC();
        return ueRepository.findByUE(ue);
    }
}
