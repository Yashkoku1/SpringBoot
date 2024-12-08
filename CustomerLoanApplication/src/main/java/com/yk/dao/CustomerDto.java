package com.yk.dao;

import java.time.LocalDate;

import jakarta.validation.constraints.DecimalMax;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;

public class CustomerDto {
	
	private int cust_Id;
	@NotNull
	private String cust_Name;
	@NotNull
	private String cust_Address;
	@NotNull
	@Pattern(regexp = "^[6789]\\d{9}$", message = "Invalid phone number format")
	private String cust_Phoneno;
	
	@NotNull
	@Pattern(regexp = "^[A-Z]{5}[0-9]{4}[A-Z]{1}$", message = "Invalid PAN card number format")
	private String cust_PanId;
	
	@NotNull
	//@DecimalMin(value="100000.00",message = "Loan amount must be equal or greter than 100000.00")
	@DecimalMax(value="10000000.00", message = "Loan amount must be less than 10000000.00")
	private double totalAmount;
	
	
	@NotNull
	private int loanDuration;
	
	
	private LocalDate date;


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
	
	
	
	
	
	
	

}
