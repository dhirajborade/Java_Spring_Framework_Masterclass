package com.dhirajborade.SpringDemo.ServiceImplementation;

import java.util.Random;
import com.dhirajborade.SpringDemo.Service.BusinessService;

public class ECommerceServiceImplementation implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs and Organization, " + companyName + " provides an outstanding E-Commerce paltform."
				+ "\nThe annual income exceeds " + random.nextInt(revenue) + " dollars.";
		return service;
	}

}
