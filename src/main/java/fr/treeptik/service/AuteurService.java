package fr.treeptik.service;

import fr.treeptik.model.Auteur;

public interface AuteurService extends GenericService<Auteur, Integer>{

	Auteur findByEmail(String email);
	
}
