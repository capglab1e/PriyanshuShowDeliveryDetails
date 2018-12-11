package com.cg.CapStore.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.CapStore.dao.ICapstoreDao;

@Service
@Transactional
public class CapstoreServiceImpl implements ICapstoreService{

	@Autowired
	ICapstoreDao dao;

	@Override
	public void orderStatus(String status) {
		dao.setStatus(status);
		
	}

	@Override
	public String showStatus(int id) {
		return dao.checkStatus(id);
		
	}

	
	
}
