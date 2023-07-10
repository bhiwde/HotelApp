package com.program.HotelApp.service.imp;

import java.util.ArrayList;

import org.springframework.stereotype.Service;

import com.program.HotelApp.entity.OrderEntity;
import com.program.HotelApp.model.OrderModel;
import com.program.HotelApp.service.IorderService;
@Service
public class OrderService implements IorderService {
ArrayList<OrderEntity> orderList = new ArrayList<>();
	@Override
	public String addorder(OrderModel ordermodel) {
		OrderEntity orderentity = new OrderEntity();
		orderentity.setOid(ordermodel.getOid());
		orderentity.setCid(ordermodel.getCid());
		orderentity.setDate(ordermodel.getDate());
		orderentity.setAmount(ordermodel.getAmount());
		orderList.add(orderentity);
		return "Order Added Successfully";
	}

	@Override
	public OrderModel getorder() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList getallorders() {
		// TODO Auto-generated method stub
		return orderList;
	}
	

}
