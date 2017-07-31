package com.dhirajborade.SpringDemo.Domain;

import com.dhirajborade.SpringDemo.Service.RecruitmentService;

public class HumanResourceDepartment implements Department {
	
	private String departmentName;
	private RecruitmentService recruitmentService;
	private Organization organization;

	public HumanResourceDepartment(RecruitmentService recruitmentService, Organization organization) {
		this.recruitmentService = recruitmentService;
		this.organization = organization;
	}

	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}

	public String hiringStatus(int numberOfRecruitments) {
		String hiringFacts = recruitmentService.recruitEmployees(organization.getCompanyName(), departmentName, numberOfRecruitments);
		return hiringFacts;
	}

}
