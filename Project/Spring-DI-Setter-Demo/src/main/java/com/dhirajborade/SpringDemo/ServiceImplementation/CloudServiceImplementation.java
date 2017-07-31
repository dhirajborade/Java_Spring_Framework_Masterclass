package com.dhirajborade.SpringDemo.ServiceImplementation;

import java.util.Random;
import com.dhirajborade.SpringDemo.Service.BusinessService;

public class CloudServiceImplementation implements BusinessService {

	public String offerService(String companyName) {
		Random random = new Random();
		String service = "\nAs and Organization, " + companyName + " offers world class Cloud Computing Infrastructure."
				+ "\nThe annual income exceeds " + random.nextInt(revenue) + " dollars.";
		return service;
	}

}
