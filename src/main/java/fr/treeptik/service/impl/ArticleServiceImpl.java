package fr.treeptik.service.impl;

import java.util.Date;
import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.ArticleDAO;
import fr.treeptik.model.Article;
import fr.treeptik.model.Categorie;
import fr.treeptik.service.ArticleService;

@Service
public class ArticleServiceImpl implements ArticleService {
	@Inject
	ArticleDAO dao;
	
	@Override
	public List<Article> findByDateCreationBetween(Date debut, Date fin) {
		return dao.findByDateCreationBetween(debut, fin);
	}

	@Override
	public List<Article> findByCategorie(String nom) {
		return dao.findByCategorie(nom);
	}

	@Override
	@Transactional
	public Article save(Article a) {
		return dao.save(a);
	}

	@Override
	public Article findOne(Integer id) {
		return dao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Article> findAll() {
		return dao.findAll();
	}
	
}
