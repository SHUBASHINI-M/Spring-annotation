package com.hexa.springannotation.com.hexa.springannotation1;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
	int Roll;
	String Name;
	Double Fee;
	@Autowired
	Result res1;
	
	
	
	public Result getRes() {
		return res1;
	}


	public void setRes(Result res) {
		res1 = res;
	}
	


	public Result getRes1() {
		return res1;
	}


	public void setRes1(Result res1) {
		this.res1 = res1;
	}


	Student()
	{
		
	}
	
	
	public Student(int roll, String name, Double fee) {
		super();
		Roll = roll;
		Name = name;
		Fee = fee;
	}


	public int getRoll() {
		return Roll;
	}
	public void setRoll(int roll) {
		Roll = roll;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public Double getFee() {
		return Fee;
	}
	public void setFee(Double fee) {
		Fee = fee;
	}
	@Override
	public String toString() {
		return "Student [Roll=" + Roll + ", Name=" + Name + ", Fee=" + Fee + "]";
	}
	

}
