package com.springProject.MySpringProject.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="student")
public class Student {
    
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int rollNo;
	
	@Column
	private String name;
	
	@Column
	private float percentage;
	
	@Column
	private String branch;
	
	@Embedded
	private Address address;
	
	public Student() {
		
	}
	
	public Student(String name, float percentage, String branch , Address address) {
		super();
		this.name = name;
		this.percentage = percentage;
		this.branch = branch;
		this.address = address;
	}

	public int getRollNo() {
		return rollNo;
	}
	public void setRollNo(int rollNo) {
		this.rollNo = rollNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPercentage() {
		return percentage;
	}
	public void setPercentage(float percentage) {
		this.percentage = percentage;
	}
	public String getBranch() {
		return branch;
	}
	public void setBranch(String branch) {
		this.branch = branch;
	}
	
	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	@Override
	public String toString() {
		return "Student [rollNo=" + rollNo + ", name=" + name + ", percentage=" + percentage + ", branch=" + branch
				+ "]";
	}
	
}
