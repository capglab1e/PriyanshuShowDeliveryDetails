package com.cg.CapStore.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table (name = "Merchant_Details")
public class Merchant {
	@Id
	@Column(name="user_id")
	private int userId;
	@Column(name="name")
	private String name;
	@Column(name="company_name")
	private String companyName;
	@Column(name="company_address")
	private String companyAddress;
	@Column(name="phone_no")
	private String phoneNo;
	@Column(name="rating")
	private float rating;
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getCompanyAddress() {
		return companyAddress;
	}
	public void setCompanyAddress(String companyAddress) {
		this.companyAddress = companyAddress;
	}
	public String getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}
	public float getRating() {
		return rating;
	}
	public void setRating(float rating) {
		this.rating = rating;
	}
	public Merchant(int userId, String name, String companyName,
			String companyAddress, String phoneNo, float rating) {
		super();
		this.userId = userId;
		this.name = name;
		this.companyName = companyName;
		this.companyAddress = companyAddress;
		this.phoneNo = phoneNo;
		this.rating = rating;
	}
	public Merchant() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Merchant [userId=" + userId + ", name=" + name
				+ ", companyName=" + companyName + ", companyAddress="
				+ companyAddress + ", phoneNo=" + phoneNo + ", rating="
				+ rating + "]";
	}
	
}
