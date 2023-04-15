package com.ness.Emp_map;

import com.ness.Employee;
import com.ness.controller.EmployeeController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.ness")
public class EmpMapApplication implements CommandLineRunner {
	@Autowired
	EmployeeController empController;



	public static void main(String[] args) {
		SpringApplication.run(EmpMapApplication.class, args);

	}

	@Override
	public void run(String[] args) throws Exception {
		Employee[] emp_array=new Employee[5];
		emp_array[0]=new Employee(1,"Ajay");
		emp_array[1]=new Employee(2,"Hari");
		emp_array[2]=new Employee(3,"Pranav");
		emp_array[3]=new Employee(4,"Ravi");
		emp_array[4]=new Employee(5,"Harsh");
		for(Employee e:emp_array)
		{
			empController.add_employee(e);
		}




		System.out.println("Employee Details");
		empController.get_data();



	}
}
