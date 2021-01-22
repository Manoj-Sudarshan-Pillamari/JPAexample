package com.cg.customer1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Customer1")

public class Customer {
	

	private int custId;
	private String custname;
	private long custmobile;
	public int getCustId() {
		return custId;
	}
	public void setCustId(int custId) {
		this.custId = custId;
	}
	public Customer(int custId, String custname, long custmobile) {
		super();
		this.custId = custId;
		this.custname = custname;
		this.custmobile = custmobile;
	}
	public Customer() {
		super();
	}
	public String getCustname() {
		return custname;
	}
	public void setCustname(String custname) {
		this.custname = custname;
	}
	public long getCustmobile() {
		return custmobile;
	}
	public void setCustmobile(long custmobile) {
		this.custmobile = custmobile;
	}

}
