package com.cg.CapStore.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.cg.CapStore.dto.Order;

@Repository
@Transactional
public class CapstoreDaoImpl implements ICapstoreDao {

	@PersistenceContext
	EntityManager manager;
	
	@Override
	public void setStatus(String Status) {
		Order order = new Order();
		order.setOrderStatus(Status);
		manager.persist(order);
	}

	@Override
	public String checkStatus(int id) {
		Order order = manager.find(Order.class, id);
		System.out.println(order.getOrderStatus());
		return order.getOrderStatus();
	}
	
	
}
