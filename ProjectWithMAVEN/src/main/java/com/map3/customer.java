package com.map3;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class customer {
	@Id
private int cust_id;
private String cust_name;
@ManyToMany
private List<bank>bank;
public int getCust_id() {
	return cust_id;
}
public void setCust_id(int cust_id) {
	this.cust_id = cust_id;
}
public String getCust_name() {
	return cust_name;
}
public void setCust_name(String cust_name) {
	this.cust_name = cust_name;
}
public List<bank> getBank() {
	return bank;
}
public void setBank(List<bank> bank) {
	this.bank = bank;
}
public customer() {
	super();
	// TODO Auto-generated constructor stub
}

}
