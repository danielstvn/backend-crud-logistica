package com.crud_logistica.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud_logistica.app.models.RegisterClient;

@Repository
public interface RegisterClientRepository extends JpaRepository<RegisterClient, Integer> {

	RegisterClient findByDni(String dni);
	boolean existsByDni(String dni);
	
	public List<RegisterClient> findAllByOrderByIdAsc();
}
