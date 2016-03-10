package fr.treeptik.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;

import org.springframework.stereotype.Repository;

public enum Role {
	ROLE_ADMIN,
	ROLE_USER,
	ROLE_ANONYMOUS;
	
	public static List<Role> getAll(){
		List<Role> roles = new ArrayList<Role>();
		roles.add(ROLE_ADMIN);
		roles.add(ROLE_USER);
		roles.add(ROLE_ANONYMOUS);
		
		return roles;
	}
	
	
}
