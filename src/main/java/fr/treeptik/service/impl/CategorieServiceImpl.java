package fr.treeptik.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.CategorieDAO;
import fr.treeptik.model.Categorie;
import fr.treeptik.service.CategorieService;

@Service
public class CategorieServiceImpl implements CategorieService {
	@Inject
	CategorieDAO dao;
	
	@Override
	@Transactional
	public Categorie save(Categorie c) {
		return dao.save(c);
	}

	@Override
	public Categorie findOne(Integer id) {
		return dao.findOne(id);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.delete(id);
		
	}

	@Override
	public List<Categorie> findAll() {
		return dao.findAll();
	}
}
