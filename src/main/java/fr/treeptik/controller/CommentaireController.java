package fr.treeptik.controller;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import fr.treeptik.model.Article;
import fr.treeptik.model.Commentaire;
import fr.treeptik.service.CommentaireService;

@Controller
@RequestMapping(value="/commentaire")
public class CommentaireController {
	@Inject
	public CommentaireService commentaireService;
	
	@RequestMapping(value="/list/articleId/{id}", produces="application/json", method = RequestMethod.GET)
	public @ResponseBody List<Commentaire> findByArticle(@PathVariable("id") Integer id){
		return commentaireService.findByArticle(id);
	}
	
	@RequestMapping(value="/addComment", consumes="application/json", method = RequestMethod.POST)
	public @ResponseBody void addCommentaire(@RequestBody Commentaire commentaire){
		System.out.println("MON COMMENTAIRE : "+commentaire);
		commentaireService.save(commentaire);
	}
	
//	@Autowired
//	public AuteurService auteurService;
//	@Autowired
//	public ArticleService articleService;
//	
//	@RequestMapping(value="/create.do", method = RequestMethod.GET)
//	public ModelAndView create(Commentaire commentaire, HttpServletRequest request)throws ServiceException{
//		String email = SecurityContextHolder.getContext().getAuthentication().getName();
//		String nom = auteurService.findNameByMail(email);
//		Integer article_id =  commentaire.getArticle().getId();
//		commentaire.setEmail(email);
//		commentaire.setNom(nom);
//		commentaire.setDateCreation(new GregorianCalendar().getTime());
//		commentaireService.save(commentaire);
//		
//		List<Commentaire> commentaires = commentaireService.tousLesCommentaireDe(article_id);
//		ModelAndView mnV = new ModelAndView("article-detail");
//		mnV.addObject("article", articleService.findOne( article_id));
//		mnV.addObject("commentaires", commentaires);
//		mnV.addObject("commentaire", new Commentaire());
//		return mnV;
//	}
//
//	@RequestMapping(value="/listAll.do", method = RequestMethod.GET)
//	public ModelAndView listAll(HttpServletRequest request)throws ServiceException{
//		ModelAndView MnV = new ModelAndView("commentaire-list");
//		List<Commentaire> commentaires = commentaireService.findAll();
//		MnV.addObject("commentaires", commentaires);
//		return MnV;
//	}
}
