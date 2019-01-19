package com.alpha;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		 ApplicationContext context=new ClassPathXmlApplicationContext("applicationContext.xml");  
	      
		    EmployeeDao dao=(EmployeeDao)context.getBean("employeedao");  
		    int status=dao.saveEmployee(new Employee(21,"kadir",1500));  
		    System.out.println(status);  
		          
		    int status1=dao.updateEmployee(new Employee(102,"Sonoo",15000)); 
		    System.out.println(status1); 
		     
		          
		    Employee e=new Employee(); 
		    e.setId(102); 
		    int status2=dao.deleteEmployee(e); 
		    System.out.println(status2);

	}

}
