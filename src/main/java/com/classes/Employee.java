package com.classes;

public class Employee {

	private Integer id;
	private double experience;
	private String name;
	
	public Employee(Integer id, double experience, String name)
	{
		this.id=id;
		this.experience=experience;
		this.name=name;
	}
	public Employee() {}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public double getExperience() {
		return experience;
	}
	public void setExperience(double experience) {
		this.experience = experience;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
}