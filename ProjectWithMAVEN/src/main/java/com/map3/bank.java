package com.map3;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
@Entity
public class bank {
	@Id
private int bank_code;
	private String bankName;
	@ManyToMany
	private List<customer>customer;
	public bank() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getBank_code() {
		return bank_code;
	}
	public void setBank_code(int bank_code) {
		this.bank_code = bank_code;
	}
	public String getBankName() {
		return bankName;
	}
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}
	public List<customer> getCustomer() {
		return customer;
	}
	public void setCustomer(List<customer> customer) {
		this.customer = customer;
	}

}
