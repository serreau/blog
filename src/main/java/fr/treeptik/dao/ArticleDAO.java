package fr.treeptik.dao;

import java.util.Date;
import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.model.Article;


public interface ArticleDAO extends JpaRepository<Article, Integer> {
	@Query("SELECT a FROM Article a WHERE a.dateCreation BETWEEN :debut AND :fin")
	public List<Article> findByDateCreationBetween(@Param("debut") Date debut, @Param("fin") Date fin) throws DataAccessException;
	@Query("SELECT a FROM Article a INNER JOIN FETCH a.categorie c WHERE c.nom LIKE :nom")
	public List<Article> findByCategorie(@Param("nom") String nom) throws DataAccessException;
}
