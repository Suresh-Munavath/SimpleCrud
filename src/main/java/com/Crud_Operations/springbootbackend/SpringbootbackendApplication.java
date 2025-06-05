package com.Crud_Operations.springbootbackend;

import com.Crud_Operations.springbootbackend.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.Crud_Operations.springbootbackend.model.Employee;

@SpringBootApplication
public class SpringbootbackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootbackendApplication.class, args);

	}
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("Application started...");
		Employee employee =new Employee();
	}


}
