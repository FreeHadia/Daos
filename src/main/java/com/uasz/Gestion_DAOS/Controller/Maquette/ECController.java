package com.uasz.Gestion_DAOS.Controller.Maquette;

import com.uasz.Gestion_DAOS.Model.Maquette.EC;
import com.uasz.Gestion_DAOS.Model.Maquette.UE;
import com.uasz.Gestion_DAOS.Repository.Maquette.ECRepository;
import com.uasz.Gestion_DAOS.Service.Maquette.ECService;
import com.uasz.Gestion_DAOS.Service.Maquette.UEService;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@AllArgsConstructor
public class ECController {
    @Autowired
    private ECService ecService;
    private ECRepository ecRepository;

    private UEService ueService;

    @RequestMapping(value = "/ajouter_ec_ue", method = RequestMethod.POST)
    public String ajouter_ec_ue(Model model, EC ec){
        ecService.ajouterEC(ec);
        return "redirect:/details_ue?id="+ec.getUe().getId();
    }
    @RequestMapping(value="/modifier_ec_ue", method = RequestMethod.POST)
    public String modifier_ec_ue(Model model,EC ec){
        ecService.modifierEC(ec);
        return "redirect:/details_ue?id="+ec.getUe().getId();
    }

    @RequestMapping(value = "/supprimer_ec_ue", method = RequestMethod.POST)
    public String supprimer_ec_ue(Model model, EC ec){
        Long id=ec.getUe().getId();
        ecService.supprimerEC(ec);
        return "redirect:/details_ue?id="+id;
    }

/*    @RequestMapping(value = "/ec", method= RequestMethod.GET)
    public String Lister_ue(Model model){
        List<EC> ecList=ecService.afficherToutEC();
        model.addAttribute("listeDesEC",ecList);
        return "ec";
    } */
}
