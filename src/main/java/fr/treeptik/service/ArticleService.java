package fr.treeptik.service;

import java.util.Date;
import java.util.List;

import fr.treeptik.model.Article;
import fr.treeptik.model.Categorie;

public interface ArticleService extends GenericService<Article, Integer>{

	List<Article> findByDateCreationBetween(Date debut, Date fin);
	List<Article> findByCategorie(String nom);
}
