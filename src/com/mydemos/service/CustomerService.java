package com.mydemos.service;

//import java.sql.SQLException;

import com.mydemos.dao.CustomerDao;
//import com.mydemos.dbutil.DbConn;
import com.mydemos.pojo.Customer;

public class CustomerService {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CustomerDao dao=new CustomerDao();
		Customer cust = new Customer();
		cust.setCustName("Rohit");
		cust.setCustLastName("Sharma");
		cust.setAddress("Mumbai");
		
		System.out.println(dao.saveCustomer(cust));
	}

}
