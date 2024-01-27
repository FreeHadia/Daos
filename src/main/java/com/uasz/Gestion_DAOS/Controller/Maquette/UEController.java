package com.uasz.Gestion_DAOS.Controller.Maquette;

import com.uasz.Gestion_DAOS.Model.Maquette.EC;
import com.uasz.Gestion_DAOS.Model.Maquette.UE;
import com.uasz.Gestion_DAOS.Service.Maquette.UEService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
@AllArgsConstructor
public class UEController {
    @Autowired
    private UEService ueService;
    @RequestMapping(value = "/ue", method= RequestMethod.GET)
    public String Lister_ue(Model model){
        List<UE> ueList=ueService.afficherToutUE();
        model.addAttribute("listeDesUE",ueList);
        return "ue";
    }

    @RequestMapping(value = "/ajouter_ue", method= RequestMethod.POST)
    public String ajouter_ue(Model model, UE ue){
        ueService.ajouterUE(ue);
        return "redirect:/ue";
    }

    @RequestMapping(value = "/modifier_ue", method= RequestMethod.POST)
    public String modifier_ue(Model model, UE ue){
        ueService.modifierUE(ue);
        return "redirect:/ue";
    }

    @RequestMapping(value = "/supprimer_ue", method= RequestMethod.POST)
    public String supprimer_ue(Model model, UE ue){
        ueService.supprimerUE(ue);
        return "redirect:/ue";
    }

    @RequestMapping(value = "/details_ue", method = RequestMethod.GET)
    public String details_ue(Model model, @RequestParam("id") Long id){
        UE ue=ueService.afficherUE(id);
        List<EC> ecList=ueService.afficherLesEC(ue);
        model.addAttribute("ue",ue);
        model.addAttribute("listDesEC",ecList);
        // System.out.println("+++++++++++++" + ue.toString());
        return "ue_details";

    }

}
