package com.program.HotelApp.service;

import java.util.ArrayList;


import com.program.HotelApp.model.OrderModel;

public interface IorderService {
public String addorder(OrderModel ordermodel);
public OrderModel getorder();
public ArrayList getallorders();
}
