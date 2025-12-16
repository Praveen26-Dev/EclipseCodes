package resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import example.Address;
import example.Student;

@Configuration
public class springConfigFile {
	@Bean
	public Address addId() {
		Address ad= new Address("321", "485772", "Maihar");
		return ad;
	}
	
	@Bean
	public Student stdId() {
		Student std=new Student("Praveen",124, addId());
		return std;
	}

}
