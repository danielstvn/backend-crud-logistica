package com.crud_logistica.app.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "clients")
public class RegisterClient {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "name", length = 35)
	private String name;

	@Column(name = "last_name", length = 35)
	private String last_name;

	@Column(name = "phone", length = 10)
	private String phone;

	@Column(name = "email", length = 45)
	private String email;

	@Column(name = "dni", length = 10, unique = true, nullable = false)
	private String dni;

	@Column(name = "country", length = 35)
	private String country;

	@Column(name = "province", length = 60)
	private String province;

	@Column(name = "city", length = 60)
	private String city;

	@Column(name = "location", length = 100)
	private String location;

	@Column(name = "postal_code", length = 6)
	private String postal_code;

	public RegisterClient() {

	}

	public RegisterClient(int id, String name, String last_name, String phone, String email, String dni, String country,
			String province, String city, String location, String postal_code) {

		this.id = id;
		this.name = name;
		this.last_name = last_name;
		this.phone = phone;
		this.email = email;
		this.dni = dni;
		this.country = country;
		this.province = province;
		this.city = city;
		this.location = location;
		this.postal_code = postal_code;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getProvince() {
		return province;
	}

	public void setProvince(String province) {
		this.province = province;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getPostal_code() {
		return postal_code;
	}

	public void setPostal_code(String postal_code) {
		this.postal_code = postal_code;
	}
	

}
