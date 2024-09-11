package com.hexa.springannotation.com.hexa.springannotation1;

import org.springframework.context.annotation.Bean;

public class StudentConfig {
	
	
	
	@Bean(name="stud1")
	
	public Student getStudent()
	{
		Student s1 = new Student();
		s1.setRoll(101);
		s1.setName("Arti");
		s1.setFee(2000.9);
		return s1;
		
	}
    @Bean(name="stud2")
	
	public Student getStudent1()
	{
		Student s2 = new Student();
		s2.setRoll(102);
		s2.setName("Ram");
		s2.setFee(3000.9);
		return s2;
		
	}
	
	@Bean(name="res")
	public Result getresult1()
	{
		Result r = new Result();
		r.setMarks(99);
		r.setRemarks("Pass");
		return r;
		
	}
	@Bean(name="res1")
	public Result getresult()
	{
		Result r = new Result();
		r.setMarks(35);
		r.setRemarks("Fail");
		return r;
		
	}

}
