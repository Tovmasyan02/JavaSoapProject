package com.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Company {

	private List<Employee> employees;
	
	public Company()
	{
		employees=new ArrayList<>();
		employees.add(new Employee(1,4,"Name1"));
		employees.add(new Employee(2,5.5,"Name2"));
		employees.add(new Employee(3,4,"Name3"));
		employees.add(new Employee(4,6,"Name4"));
		
	}

	public List<Employee> getEmployees() {
		return employees;
	}

	public void setEmployees(List<Employee> employees) {
		this.employees = employees;
	}
	
	public Employee findEmployeeById(int id)
	{
		List<Employee> filterEmp= this.employees.stream().filter(emp->emp.getId()==id)
									  .collect(Collectors.toList());
		
		if(filterEmp!=null)
			return filterEmp.get(0);
		return null;
	}
	
	
	public List<Employee> findEmployeesByExperience(double experiance)
	{
		List<Employee> filterEmp= this.employees.stream().filter(emp->emp.getExperience()==experiance)
									  .collect(Collectors.toList());
		return filterEmp;
	}
}