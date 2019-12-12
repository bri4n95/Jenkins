package com.eduit.controller;

import java.math.BigDecimal;
import java.sql.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.eduit.models.Bike;
import com.eduit.repositories.BikeRepository;

@RestController
@RequestMapping("micro/v1/bikes")
public class BikeController {

	@Autowired
	private BikeRepository bk ;
	
	@GetMapping
	public List<Bike> lista(){
		return bk.findAll();
		
	}
	@GetMapping("traeruno/{id}")
	public Bike byID(@PathVariable long id){
		return bk.getOne(id);
		
	}
	@GetMapping("borrar/{id}")
	public void borrar(@PathVariable long id){
		bk.deleteById(id);
		
	}
	@GetMapping("insertMock")
	public void insert(){
		Bike bike = new Bike();
		bike.setId(Long.parseLong("999"));
		bike.setEmail("blabla@blALA.COM");
		bike.setModel("Prueba");
		bike.setContact(true);
		bike.setName("bra");
		bike.setPhone("111112222");
		bike.setPurchase_date(new Date(11223355));
		bike.setPurchase_price(BigDecimal.valueOf(15151.51));
		bike.setSerial_number("312312saassaas");
		bk.save(bike);
		
	}
}
