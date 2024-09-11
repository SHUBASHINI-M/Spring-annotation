package com.hexa.springannotation.com.hexa.springannotation1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	//ApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
    	AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(StudentConfig.class);
    	Student s = (Student)context.getBean("stud1");
    	Result r = s.getRes();
        System.out.println(r.toString());
        System.out.println(s.toString());
        
        Student s1 = (Student)context.getBean("stud2");
    	Result r1 = s1.getRes();
        System.out.println(r1.toString());
        System.out.println(s1.toString());
    }
}
