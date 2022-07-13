package com.crud_logistica.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.crud_logistica.app.models.ShippingPlan;
import com.crud_logistica.app.repository.IShippingPlanRepository;


@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class ShippingPlanController {
	
	@Autowired
	IShippingPlanRepository repository;
	
	@PostMapping("/addShippingPlan")
	public ShippingPlan addShippingPlan (@RequestBody ShippingPlan spp) {
		

		return repository.save(spp);
		
	}
	
	@GetMapping("/getShipping")
	public List<ShippingPlan> getListSgipping(){
		return repository.findAllByOrderByIdAsc();
	}

}
