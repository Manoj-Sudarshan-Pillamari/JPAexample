package com.cg.customer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="customer")
public class Customer {

	@Id
	private int cid;
	
//	@Transient
	private String cname;
	
//	@Column(name="Age")
//	private int cage;
	
	public Customer() {
		super();
	}
	public Customer(int cid, String cname, long cnumber) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.cnumber = cnumber;
	}
	public int getCid() {
		return cid;
	}
	public void setCid(int cid) {
		this.cid = cid;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	public long getCnumber() {
		return cnumber;
	}
	public void setCnumber(long cnumber) {
		this.cnumber = cnumber;
	}
	private long cnumber;
	
}
