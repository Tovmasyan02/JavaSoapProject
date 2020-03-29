package com.service;

import java.util.ArrayList;
import java.util.List;

import com.classes.*;

import services.all.GetEmployeeDocument;
import services.all.GetEmployeeResponseDocument;
import services.all.GetEmployeeResponseDocument.GetEmployeeResponse;
import services.all.GetEmployeesByExperienceDocument;
import services.all.GetEmployeesByExperienceResponseDocument;
import services.all.GetEmployeesByExperienceResponseDocument.GetEmployeesByExperienceResponse;

public class CompanyService implements CompanyServiceSkeletonInterface {

	public GetEmployeeResponseDocument getEmployee(GetEmployeeDocument getEmployee) {
		
		
		int id=getEmployee.getGetEmployee().getEmployeeId();
		
		Company company=new Company();
		
		services.all.Employee employee=services.all.Employee.Factory.newInstance();
		Employee emp=company.findEmployeeById(id);
		
		if(emp==null)
			return null;
		
		employee.setExperience(emp.getExperience());
		employee.setName(emp.getName());
		
		GetEmployeeResponseDocument employeeResponseDocument = GetEmployeeResponseDocument.Factory.newInstance();
		GetEmployeeResponse employeeResponse=GetEmployeeResponse.Factory.newInstance();
		employeeResponse.setReturn(employee);
		employeeResponseDocument.setGetEmployeeResponse(employeeResponse);
		
		return employeeResponseDocument;
	
	}

	public GetEmployeesByExperienceResponseDocument getEmployeesByExperience(
			GetEmployeesByExperienceDocument getEmployeesByExperience) {
		
		double exp=getEmployeesByExperience.getGetEmployeesByExperience().getExperience();
		
		List<services.all.Employee> employees = new ArrayList<>();
		Company company=new Company();
		services.all.Company result = services.all.Company.Factory.newInstance();
		List<Employee> employeesList=company.findEmployeesByExperience(exp);
		
		for(Employee emp:employeesList)
		{
			services.all.Employee empInst=services.all.Employee.Factory.newInstance();
			empInst.setEmployeeId(emp.getId());
			empInst.setExperience(emp.getExperience());
			empInst.setName(emp.getName());
			employees.add(empInst);
		}
		
		result.setEmployeeArray((services.all.Employee[])employees.toArray());
		GetEmployeesByExperienceResponseDocument employeesResponseDocument = GetEmployeesByExperienceResponseDocument.Factory.newInstance();
		GetEmployeesByExperienceResponse employeesResponse = GetEmployeesByExperienceResponse.Factory.newInstance();
		employeesResponse.setReturn(result);
		employeesResponseDocument.setGetEmployeesByExperienceResponse(employeesResponse);
        return employeesResponseDocument;
		
	
	}

}
