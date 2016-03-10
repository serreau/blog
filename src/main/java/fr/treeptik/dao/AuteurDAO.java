package fr.treeptik.dao;

import org.springframework.dao.DataAccessException;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import fr.treeptik.model.Auteur;

public interface AuteurDAO extends JpaRepository<Auteur, Integer> {

	@Query("SELECT a FROM Auteur a WHERE a.email = :email")
	Auteur findByEmail(@Param("email") String email) throws DataAccessException;

}
