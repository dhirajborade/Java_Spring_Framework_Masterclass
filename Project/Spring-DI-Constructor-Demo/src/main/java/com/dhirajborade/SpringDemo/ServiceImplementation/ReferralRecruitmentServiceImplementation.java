package com.dhirajborade.SpringDemo.ServiceImplementation;

import java.util.Random;

import com.dhirajborade.SpringDemo.Service.RecruitmentService;

public class ReferralRecruitmentServiceImplementation implements RecruitmentService {

	public String recruitEmployees(String companyName, String departmentName, int numberOfRecruitments) {
		Random random = new Random();
		String hiringFacts = "\n" + companyName + "'s " + departmentName + " hired "
				+ random.nextInt(numberOfRecruitments) + " employees through referrals.";
		return hiringFacts;
	}

}
