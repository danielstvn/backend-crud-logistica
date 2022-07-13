package com.crud_logistica.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "shipping_plan")
public class ShippingPlan {
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int id;
	 
	 @Column(name = "logistic", length = 35)
	 private String logistic;
	 
	 @Column(name = "type_product", length = 60)
	 private String type_product;
	 
	 @Column(name = "quantity", length = 20)
	 private String quantity;
	 
	 @Column(name = "register_date", length = 20)
	 private String register_date;
	 
	 @Column(name = "delivery_date", length = 20)
	 private String delivery_date;
	 
	 @Column(name = "cellar_delivery", length = 60)
	 private String cellar_delivery;
	 
	 @Column(name = "price", nullable = false , length = 16 ,scale = 2)
	 private double price;
	 
	 @Column(name = "id_transport", length = 35)
	 private String id_transport;
	 
	 @Column(name = "id_client", length = 35)
	 private String id_client;
	 
	 @Column(name = "number_guide", length = 35)
	 private String number_guide;

	public ShippingPlan() {
		
	}

	public ShippingPlan(int id, String logistic, String type_product, String quantity, String register_date,
			String delivery_date, String cellar_delivery, double price, String id_transport, String id_client,
			String number_guide) {
		super();
		this.id = id;
		this.logistic = logistic;
		this.type_product = type_product;
		this.quantity = quantity;
		this.register_date = register_date;
		this.delivery_date = delivery_date;
		this.cellar_delivery = cellar_delivery;
		this.price = price;
		this.id_transport = id_transport;
		this.id_client = id_client;
		this.number_guide = number_guide;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getLogistic() {
		return logistic;
	}

	public void setLogistic(String logistic) {
		this.logistic = logistic;
	}

	public String getType_product() {
		return type_product;
	}

	public void setType_product(String type_product) {
		this.type_product = type_product;
	}

	public String getQuantity() {
		return quantity;
	}

	public void setQuantity(String quantity) {
		this.quantity = quantity;
	}

	public String getRegister_date() {
		return register_date;
	}

	public void setRegister_date(String register_date) {
		this.register_date = register_date;
	}

	public String getDelivery_date() {
		return delivery_date;
	}

	public void setDelivery_date(String delivery_date) {
		this.delivery_date = delivery_date;
	}

	public String getCellar_delivery() {
		return cellar_delivery;
	}

	public void setCellar_delivery(String cellar_delivery) {
		this.cellar_delivery = cellar_delivery;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getId_transport() {
		return id_transport;
	}

	public void setId_transport(String id_transport) {
		this.id_transport = id_transport;
	}

	public String getId_client() {
		return id_client;
	}

	public void setId_client(String id_client) {
		this.id_client = id_client;
	}

	public String getNumber_guide() {
		return number_guide;
	}

	public void setNumber_guide(String number_guide) {
		this.number_guide = number_guide;
	}
	

	


	 
	 

}
