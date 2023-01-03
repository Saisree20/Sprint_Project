package com.property_finder.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
@Id
private long Cust_id;
private String Cust_name;
public long getCust_id() {
	return Cust_id;
}
public void setCust_id(long cust_id) {
	Cust_id = cust_id;
}
public String getCust_name() {
	return Cust_name;
}
public void setCust_name(String cust_name) {
	Cust_name = cust_name;
}
@Override
public String toString() {
	return "Customer [Cust_id=" + Cust_id + ", Cust_name=" + Cust_name + "]";
}
public Customer(long cust_id, String cust_name) {
	super();
	Cust_id = cust_id;
	Cust_name = cust_name;
}
public Customer() {
	super();
	// TODO Auto-generated constructor stub
}

}
