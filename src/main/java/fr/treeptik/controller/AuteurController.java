package fr.treeptik.controller;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.treeptik.model.Auteur;
import fr.treeptik.service.AuteurService;

@Controller
@RequestMapping(value="/auteur")
public class AuteurController {
	@Inject
	public AuteurService auteurService;
	
	@RequestMapping(value="/findByEmail/email/{email}", produces="application/json", method = RequestMethod.GET)
	public @ResponseBody Auteur findByEmail(@PathVariable("email") String email){
		return auteurService.findByEmail(email);
	}
}
