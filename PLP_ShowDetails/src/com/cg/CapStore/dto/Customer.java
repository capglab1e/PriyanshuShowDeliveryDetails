package com.cg.CapStore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="Customer_Details")
public class Customer {
	@Id
	@Column(name="user_id")
	private int customerId;
	@Column(name="first_name")
	private String firstName;
	@Column(name="last_name")
	private String lastName;
	@Column(name="phone_no")
	private String phoneNo;
	@Column(name="del_address")
	private String address;
	@Column(name="email_id")
	private String email;
	@Column(name="password")
	private String password;
	@Column(name="order_id")
	private String orderId;
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getOrderId() {
		return orderId;
	}
	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}
	
	public Customer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Customer(int customerId, String firstName, String lastName,
			String phoneNo, String address, String email, String password,
			String orderId) {
		super();
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.phoneNo = phoneNo;
		this.address = address;
		this.email = email;
		this.password = password;
		this.orderId = orderId;
	}
	@Override
	public String toString() {
		return "CapstoreServiceImpl [customerId=" + customerId + ", firstName="
				+ firstName + ", lastName=" + lastName + ", phoneNo=" + phoneNo
				+ ", address=" + address + ", email=" + email + ", password="
				+ password + ", orderId=" + orderId + "]";
	}
}