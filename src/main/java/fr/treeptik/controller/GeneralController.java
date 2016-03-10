package fr.treeptik.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import fr.treeptik.model.Auteur;
import fr.treeptik.service.ArticleService;
import fr.treeptik.service.CategorieService;

@Controller
@RequestMapping(value = "/home")
public class GeneralController {
	ArticleService articleService;
	CategorieService categorieService;
	
//	
//	@RequestMapping(value = "/login.do", method = RequestMethod.GET)
//	public ModelAndView login() {
//		ModelAndView MnV = new ModelAndView("login");
//		return MnV;
//	}
//	
//	@RequestMapping(value = "/home.do", method = RequestMethod.GET)
//	public ModelAndView list(HttpServletRequest request) {
//		ModelAndView MnV = new ModelAndView("accueil");
//		return MnV;
//	}
//
//	@RequestMapping(value = "/inscription.do", method = RequestMethod.GET)
//	public ModelAndView signUp(HttpServletRequest request) {
//		ModelAndView mnV = new ModelAndView("inscription-form");
//		mnV.addObject("auteur", new Auteur());
//		return mnV;
//	}
}
