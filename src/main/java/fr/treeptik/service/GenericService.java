package fr.treeptik.service;

import java.util.List;

public interface GenericService<T, Pk> {
	public T save(T t);
	public T findOne(Pk key);
	public void delete(Pk key);
	public List<T> findAll();
}
