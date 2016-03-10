package fr.treeptik.service;

import java.util.List;

import fr.treeptik.model.Commentaire;

public interface CommentaireService extends GenericService<Commentaire, Integer>{
	List<Commentaire> findByArticle(Integer id);
}
