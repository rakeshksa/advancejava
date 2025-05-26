package com.employeeManagement.entity;

public class Entity {
	private int id;
	private String name;
	private int age;
	private int sal;


	public Entity(int id, String name, int age, int sal) {
		
		this.id = id;
		this.name = name;
		this.age = age;
		this.sal = sal;
	}


	@Override
	public String toString() {
		return "Entity [id=" + id + ", name=" + name + ", age=" + age + ", sal=" + sal + "]"+"\n";
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getAge() {
		return age;
	}


	public void setAge(int age) {
		this.age = age;
	}


	public int getSal() {
		return sal;
	}


	public void setSal(int sal) {
		this.sal = sal;
	}
	
	
	

}
