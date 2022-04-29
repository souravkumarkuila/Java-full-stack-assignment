package com.rabbit.customerservice.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Customer {
	@Id
	private String costumerId;
    private String name;
    private int age;
    private String mobile_number;
    
    public Customer() {}
	public Customer(String costumerId, String name, int age, String mobile_number) {
		this.costumerId = costumerId;
		this.name = name;
		this.age = age;
		this.mobile_number = mobile_number;
	}
	public String getCostumerId() {
		return costumerId;
	}
	public void setCostumerId(String costumerId) {
		this.costumerId = costumerId;
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
	public String getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(String mobile_number) {
		this.mobile_number = mobile_number;
	}
	@Override
	public String toString() {
		return "Customer [costumerId=" + costumerId + ", name=" + name + ", age=" + age + ", mobile_number="
				+ mobile_number + "]";
	}
}
