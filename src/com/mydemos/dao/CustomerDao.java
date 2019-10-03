package com.mydemos.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.mydemos.dbutil.DbConn;
import com.mydemos.pojo.Customer;

public class CustomerDao {
	public String saveCustomer(Customer customer) {
		
		try
		{
		Connection con=DbConn.getConnection();
		int seq_id = 0;
		String sql = "select jdbc_seq.nextval from DUAL";
		PreparedStatement ps = con.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		if(rs.next()) {
			seq_id = rs.getInt(1);
		}

		sql="insert into customer values(?,?,?,?)";
		PreparedStatement vkr = con.prepareStatement(sql);
		String id  =null;
		vkr.setString(1, customer.getCustLastName());
		vkr.setString(2, customer.getCustLastName());
		
		if (seq_id < 10) {
            id = "00" + seq_id;
        } else if (seq_id >= 10 && seq_id < 100) {
            id = "0" + seq_id;
        } else {
            id = "" + seq_id;
        }		
		id = customer.getCustName().substring(0, 2) + customer.getCustLastName().substring(0, 2) + id;
		customer.setCustId(id);
        vkr.setString(3, customer.getCustId());
		vkr.setString(4, customer.getAddress());


		int res= vkr.executeUpdate();
		if(res>0)
		return "customer saved";


		}
		catch (Exception e) {
		e.printStackTrace();
		}

		return "Cannot save Customer";

		}
	

}
