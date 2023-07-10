package com.program.HotelApp.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.program.HotelApp.model.OrderModel;
import com.program.HotelApp.service.IorderService;

@RestController
@RequestMapping("/HotelApp/Order")
public class Ordercontroller {
	@GetMapping("/home")
	public String home() {
		return "Welcome to Order Site";}
		
	@Autowired
	IorderService OrderService;
	@PostMapping("/addorder")
	public String addorder(@RequestBody OrderModel ordermodel) {
		return OrderService.addorder(ordermodel);
			 
		 }
		
		public OrderModel getorder() {
			return null;
			 
		 }
		 
		@GetMapping("/getallorders")
		public ArrayList getallorders() {
			return OrderService.getallorders();
			 
		 
		
		
	}

}
