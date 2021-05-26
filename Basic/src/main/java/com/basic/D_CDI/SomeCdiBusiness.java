package com.basic.D_CDI;

//import javax.inject.Inject;
//import javax.inject.Named;

//@Named replaces @Component from Spring //CDI is Java EE based dependency injection 
public class SomeCdiBusiness {
	
	//@Inject	replaces @Autowired from Spring
	SomeCdiDao someCdiDao;

	public SomeCdiDao getSomeCDIDAO() {
		return someCdiDao;
	}

	public void setSomeCDIDAO(SomeCdiDao someCdiDao) {
		this.someCdiDao = someCdiDao;
	}
}