package com.crud_logistica.app.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.crud_logistica.app.models.ShippingPlan;

public interface IShippingPlanRepository extends JpaRepository<ShippingPlan, Integer> {

	List<ShippingPlan> findAllByOrderByIdAsc();
}
