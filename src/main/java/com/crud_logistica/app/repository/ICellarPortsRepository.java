package com.crud_logistica.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.crud_logistica.app.models.CellarPorts;

@Repository
public interface ICellarPortsRepository extends JpaRepository<CellarPorts, Integer> {

	public List<CellarPorts> findAllByOrderByIdAsc();
}
