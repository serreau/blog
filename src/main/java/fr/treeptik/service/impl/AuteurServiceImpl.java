package fr.treeptik.service.impl;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import fr.treeptik.dao.AuteurDAO;
import fr.treeptik.model.Auteur;
import fr.treeptik.service.AuteurService;

@Service
public class AuteurServiceImpl implements AuteurService {
	@Inject
	AuteurDAO dao;
	
	@Override
	public Auteur findByEmail(String email) {
		return dao.findByEmail(email);
	}

	@Override
	@Transactional
	public Auteur save(Auteur a) {
		return dao.save(a);
	}

	@Override
	public Auteur findOne(Integer id) {
		return findOne(id);
	}

	@Override
	@Transactional
	public void delete(Integer id) {
		dao.delete(id);
	}

	@Override
	public List<Auteur> findAll() {
		return dao.findAll();
	}
	
}
