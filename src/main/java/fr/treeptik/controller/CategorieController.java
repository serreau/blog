package fr.treeptik.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.treeptik.model.Categorie;
import fr.treeptik.service.CategorieService;

@Controller
@RequestMapping(value="/categorie")
public class CategorieController {
	@Inject
	public CategorieService categorieService;
	
	@RequestMapping(value="/findAll", produces = "application/json",  method = RequestMethod.GET)
	public @ResponseBody List<Categorie> findAll(){
		return categorieService.findAll();
	}
	
	@RequestMapping(value="/delete/id/{id}", method=RequestMethod.DELETE)
	public @ResponseBody void remove(@PathVariable("id") Integer key){
		categorieService.delete(key);
	}
}
