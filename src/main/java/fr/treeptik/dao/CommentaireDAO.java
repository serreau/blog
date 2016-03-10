package fr.treeptik.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.model.Commentaire;


public interface CommentaireDAO extends JpaRepository<Commentaire, Integer> {
	
	@Query("SELECT c FROM Commentaire c WHERE c.article.id = :id")
	List<Commentaire> findByArticleId(@Param("id") Integer id) throws DataAccessException;;

}