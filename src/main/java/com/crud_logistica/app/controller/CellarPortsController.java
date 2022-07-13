package com.crud_logistica.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud_logistica.app.models.CellarPorts;
import com.crud_logistica.app.repository.ICellarPortsRepository;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class CellarPortsController {
	
	@Autowired
	ICellarPortsRepository repository;
	
	@PostMapping("/addCellarPorts")
	public CellarPorts addCellarPort(@RequestBody CellarPorts cllpts ) {
		
		return repository.save(cllpts);
	}
	
	@GetMapping("/listCellarPorts")
	public List<CellarPorts> getListCellarPorts(){
		return repository.findAllByOrderByIdAsc();
	}
	
	@GetMapping("/getcellarPortId/{id}")
	public CellarPorts getcellarPortId(@PathVariable Integer id){
		return repository.findById(id).get();
	}
	
	@DeleteMapping("/deleteCellarPort/{id}")
	public void deleteCellarPort(@PathVariable Integer id) {
		repository.deleteById(id);
	}
	
	@PutMapping("/updateCellarPort/{id}")
	public CellarPorts updateCellarPort(@RequestBody CellarPorts cllpts ,@PathVariable Integer id) {
		
		CellarPorts cellarPorts = repository.findById(id).get();
		
		cellarPorts.setCountry(cllpts.getCountry());
		cellarPorts.setLocation(cllpts.getLocation());
		cellarPorts.setName(cllpts.getName());
		cellarPorts.setType(cllpts.getType());
		cellarPorts.setAvailability(cllpts.isAvailability());
		
		return repository.save(cellarPorts);
		
	}

}
