package com.cg.CapStore.dto;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table (name="Order_capstore")
public class Order {
	@Column(name="customer_id")
	private int customerId;
	@Id
	@Column(name="order_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int orderId;
	@Column(name="order_status") 
	private String orderStatus;
	@Column(name="order_date")
	private LocalDate orderDate;
	@Column(name="total_price")
	private double totalPrice;
	
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getOrderId() {
		return orderId;
	}
	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}
	public String getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
	public LocalDate getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(LocalDate orderDate) {
		this.orderDate = orderDate;
	}
	public double getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(double totalPrice) {
		this.totalPrice = totalPrice;
	}
	@Override
	public String toString() {
		return "Order [customerId=" + customerId + ", orderId=" + orderId
				+ ", orderStatus=" + orderStatus + ", orderDate=" + orderDate
				+ ", totalPrice=" + totalPrice + "]";
	}
	public Order() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Order(int customerId, int orderId, String orderStatus,
			LocalDate orderDate, double totalPrice) {
		super();
		this.customerId = customerId;
		this.orderId = orderId;
		this.orderStatus = orderStatus;
		this.orderDate = orderDate;
		this.totalPrice = totalPrice;
	}
	
}
