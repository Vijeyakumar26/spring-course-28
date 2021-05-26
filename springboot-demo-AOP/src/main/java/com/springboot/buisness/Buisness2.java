package com.springboot.buisness;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.DAO2;

@Service
public class Buisness2 {
	
	@Autowired
	private DAO2 dao2;
	
	public String calculate()
	{
	 return dao2.retrieveData();
	}
}
