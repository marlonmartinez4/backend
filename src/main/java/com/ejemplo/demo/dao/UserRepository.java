package com.ejemplo.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ejemplo.demo.modelo.Usuarios;

public interface UserRepository extends JpaRepository<Usuarios, Long> {
	
	@SuppressWarnings("unchecked")
	Usuarios save(Usuarios user);
	
}
