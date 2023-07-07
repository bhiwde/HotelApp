package com.program.HotelApp.service.imp;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.program.HotelApp.entity.CustomerEntity;
import com.program.HotelApp.model.CustomerModel;
import com.program.HotelApp.service.ICustomerService;
@Service
public class CustomerService implements ICustomerService {
	ArrayList<CustomerEntity> customberList = new ArrayList<>();

	@Override
	public String addcustomber(CustomerModel custombermodel) {
		CustomerEntity customberentity = new CustomerEntity();
		customberentity.setCid(custombermodel.getCid());
		customberentity.setCname(custombermodel.getCname());
		customberentity.setMobileno(custombermodel.getEmailid());
		customberentity.setEmailid(custombermodel.getEmailid());
		
		customberList.add(customberentity);
		
		return "Customber Added Succesfully";
	}

	@Override
	public ArrayList getallcustomber() {
		// TODO Auto-generated method stub
		return customberList;
	}

}
