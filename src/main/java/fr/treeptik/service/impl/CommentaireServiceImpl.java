package fr.treeptik.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.CommentaireDAO;
import fr.treeptik.model.Commentaire;
import fr.treeptik.service.CommentaireService;

@Service
public class CommentaireServiceImpl implements CommentaireService {
	@Inject
	CommentaireDAO dao;

	@Override
	@Transactional
	public Commentaire save(Commentaire a) {
		return dao.save(a);
	}

	@Override
	public Commentaire findOne(Integer id) {
		return dao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Commentaire> findAll() {
		return dao.findAll();
	}

	@Override
	public List<Commentaire> findByArticle(Integer id) {
		return dao.findByArticleId(id);
	}

	@Override
	@Transactional
	public void deleteByArticle(Integer id) {
		dao.deleteByArticleId(id);
	}
}
