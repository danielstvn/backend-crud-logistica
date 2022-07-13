package com.crud_logistica.app.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.crud_logistica.app.models.RegisterClient;
import com.crud_logistica.app.repository.RegisterClientRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class RegisterClientController {
	
	@Autowired
	RegisterClientRepository repository;
	
	@GetMapping("/show")
	public List<RegisterClient> get(){
		return repository.findAllByOrderByIdAsc();
	}
	
	@PostMapping("/registerUser")
	public RegisterClient addClient(@RequestBody @Validated RegisterClient rc ) {
		
		return repository.save(rc);
						
	}
	
	@GetMapping("/getClientid/{id}")
	public RegisterClient getClientId(@PathVariable int id){
			
		return  repository.findById(id).get();
	}
	
	@PutMapping("/updateClient/{id}")
	public RegisterClient updateClient(@RequestBody RegisterClient rc,@PathVariable Integer id) {
		
		RegisterClient registerClient = repository.findById(id).get();
		registerClient.setName(rc.getName());
		registerClient.setLast_name(rc.getLast_name());
		registerClient.setEmail(rc.getEmail());
		registerClient.setPhone(rc.getPhone());
		registerClient.setDni(rc.getDni());
		registerClient.setCountry(rc.getCountry());
		registerClient.setProvince(rc.getProvince());
		registerClient.setCity(rc.getCity());
		registerClient.setLocation(rc.getLocation());
		registerClient.setPostal_code(rc.getPostal_code());
		
		return repository.save(registerClient);
		
	}
	
	@DeleteMapping("/deleteClient/{id}")
	public void deleteclient(@PathVariable Integer id) {
		
		repository.deleteById(id);
	}
	
	@GetMapping("/findClient/{dni}")
	public boolean findClient(@PathVariable String dni) {
		return repository.existsByDni(dni);
	}
	
	
}
