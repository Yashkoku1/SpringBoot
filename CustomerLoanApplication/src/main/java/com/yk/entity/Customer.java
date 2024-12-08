package com.yk.entity;

import java.time.LocalDate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "customerentity")
public class Customer {

	@Id
	private int cust_Id;
	
	@Column(length = 30)
	private String cust_Name;
	
	private String cust_Address;

	private String cust_Phoneno;
	
	private String cust_PanId;
	
	
	
	private double totalAmount;
	
	private int loanDuration;
	
	private LocalDate date;
	
	private double downpayment;

	public int getCust_Id() {
		return cust_Id;
	}

	public void setCust_Id(int cust_Id) {
		this.cust_Id = cust_Id;
	}

	public String getCust_Name() {
		return cust_Name;
	}

	public void setCust_Name(String cust_Name) {
		this.cust_Name = cust_Name;
	}

	public String getCust_Address() {
		return cust_Address;
	}

	public void setCust_Address(String cust_Address) {
		this.cust_Address = cust_Address;
	}

	public String getCust_Phoneno() {
		return cust_Phoneno;
	}

	public void setCust_Phoneno(String cust_Phoneno) {
		this.cust_Phoneno = cust_Phoneno;
	}

	public String getCust_PanId() {
		return cust_PanId;
	}

	public void setCust_PanId(String cust_PanId) {
		this.cust_PanId = cust_PanId;
	}

	public double getTotalAmount() {
		return totalAmount;
	}

	public void setTotalAmount(double totalAmount) {
		this.totalAmount = totalAmount;
	}

	public int getLoanDuration() {
		return loanDuration;
	}

	public void setLoanDuration(int loanDuration) {
		this.loanDuration = loanDuration;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public double getDownpayment() {
		return downpayment;
	}

	public void setDownpayment(double downpayment) {
		this.downpayment = downpayment;
	}
	
	
	
	
	
}
