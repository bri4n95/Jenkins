package com.eduit.models;

import java.math.BigDecimal;
import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;


@JsonIgnoreProperties({"hibernateLazyInitializer","handler"})
@Entity
public class Bike {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id ;
	private boolean contact;
	private String email;
	private String model;
	private String name;
	private String phone;
	private Date purchase_date ;
	private BigDecimal purchase_price;
	private String serial_number ;
	public Long getId() {
		return id;
	}
	public boolean isContact() {
		return contact;
	}
	public String getEmail() {
		return email;
	}
	public String getModel() {
		return model;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public Date getPurchase_date() {
		return purchase_date;
	}
	public BigDecimal getPurchase_price() {
		return purchase_price;
	}
	public String getSerial_number() {
		return serial_number;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public void setContact(boolean contact) {
		this.contact = contact;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setPurchase_date(Date purchase_date) {
		this.purchase_date = purchase_date;
	}
	public void setPurchase_price(BigDecimal purchase_price) {
		this.purchase_price = purchase_price;
	}
	public void setSerial_number(String serial_number) {
		this.serial_number = serial_number;
	}
	
	
	
}
