package com.springboot.buisness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.DAO1;

@Service
public class Buisness1 {
	
	@Autowired
	private DAO1 dao1;
	
	public String calculate()
	{
	 return dao1.retrieveData();
	}
}
