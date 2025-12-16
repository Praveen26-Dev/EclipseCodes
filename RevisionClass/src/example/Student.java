package example;

import org.springframework.beans.factory.annotation.Autowired;

public class Student {
String name;
int rollno;
@Autowired
Address address;





public Student(String name, int rollno, Address address) {
	super();
	this.name = name;
	this.rollno = rollno;
	this.address = address;
}





public void display()
{
	System.out.println(name+","+rollno+",");
	System.out.println("Address"+address);
}
}
