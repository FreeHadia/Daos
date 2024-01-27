package com.uasz.Gestion_DAOS;

import com.uasz.Gestion_DAOS.Model.Maquette.UE;
import com.uasz.Gestion_DAOS.Model.Maquette.EC;
import com.uasz.Gestion_DAOS.Repository.Maquette.ECRepository;
import com.uasz.Gestion_DAOS.Repository.Maquette.UERepository;
import com.uasz.Gestion_DAOS.Service.Maquette.ECService;
import com.uasz.Gestion_DAOS.Service.Maquette.UEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import javax.xml.crypto.Data;

@SpringBootApplication
public class GestionDaosApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(GestionDaosApplication.class, args);
	}

	@Autowired
	private ECRepository ecRepository;
	@Autowired
	private UEService ueService;
	@Autowired
	private ECService ecService;

	@Override
	public void run(String... args) throws Exception {

		//ueRepository.save(new  UE(null,"reseau sans fil","Nf264",8,4,null,null,null));
		ueService.ajouterUE(new UE(null, "INF351", "Genie Logiciel", 8, 4, null, null, null));
		ueService.ajouterUE(new UE(null, "INF352", "Reseaux et Telecoms", 8, 4, null, null, null));
		ueService.ajouterUE(new UE(null, "INF353", "Technologie embarque et Mobile", 8, 4, null, null, null));
		ueService.ajouterUE(new UE(null, "INF354", "Gestion de données structurée", 8, 4, null, null, null));
		ueService.ajouterUE(new UE(null, "INF355", "Humanites et Entreprise", 6, 3, null, null, null));
		ueService.ajouterUE(new UE(null,"INF356","Service informatique Avancer",8,4,null,null,null));
		ueService.ajouterUE(new UE(null,"INF357","Reseaux et Systemes",6,3,null,null,null));

		ecService.ajouterEC(new EC(null,"INF351","Genie Logiciel",24,24,12,0,36,24,60,null));
		ecService.ajouterEC(new EC(null,null,null,24,24,12,0,36,24,60,null));

	}
}