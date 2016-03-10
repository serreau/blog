package fr.treeptik.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.treeptik.model.Categorie;


public interface CategorieDAO extends JpaRepository<Categorie, Integer> {


}
