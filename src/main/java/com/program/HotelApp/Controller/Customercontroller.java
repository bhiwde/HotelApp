package com.program.HotelApp.Controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.program.HotelApp.model.CustomerModel;
import com.program.HotelApp.service.ICustomerService;

@RestController
@RequestMapping("/HotelApp/Customber")
public class Customercontroller {
	
	@Autowired
	ICustomerService  customerservice;
	
	@GetMapping("/home")
	public String home() {
		return "Welcom to  Customer Site";
		}
	
	@PostMapping("/addcustomer")
	public String addcustomber(@RequestBody CustomerModel custombermodel) {
		return customerservice.addcustomber(custombermodel) ;
	}
	
	@GetMapping("/getallcustomber")
	 public ArrayList getallcustomber() {
		return customerservice.getallcustomber();
	}
		 
	 }

