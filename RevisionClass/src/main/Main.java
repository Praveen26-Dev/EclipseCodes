package main;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



import example.Student;
import resources.springConfigFile;

public class Main {
	public static void main(String[] args) {
	
		ApplicationContext context =new AnnotationConfigApplicationContext(springConfigFile.class);
		
		Student student= (Student) context.getBean("stdId");
	    
	    student.display();
	}
}
