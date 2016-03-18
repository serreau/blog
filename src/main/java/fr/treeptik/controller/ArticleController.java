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
import fr.treeptik.service.ArticleService;
import fr.treeptik.service.CommentaireService;

@Controller
@RequestMapping(value="/article")
public class ArticleController {
	@Inject
	public ArticleService articleService;
	@Inject
	public CommentaireService commentaireService;
	
	@RequestMapping(value="/add", consumes="application/json", method = RequestMethod.POST)
	public @ResponseBody void addArticle(@RequestBody Article article){
		System.out.println("MON ARTICLE : "+article);
		articleService.save(article);
	}
	
	@RequestMapping(value="/list/category/nom/{nom}", produces="application/json", method = RequestMethod.GET)
	public @ResponseBody List<Article> findByCategorie(@PathVariable("nom") String nom){
		return articleService.findByCategorie(nom);
	}
	
	@RequestMapping(value="/detail/articleId/{articleId}", 
					produces="application/json", 
					method = RequestMethod.GET)
	public @ResponseBody Article findOne(@PathVariable("articleId") Integer id){
		return articleService.findOne(id);
	}
	@RequestMapping(value="/remove/articleId/{articleId}", 
			method = RequestMethod.DELETE)
	public @ResponseBody void removeOne(@PathVariable("articleId") Integer id){
		commentaireService.deleteByArticle(id);
		articleService.delete(id);
}
}
