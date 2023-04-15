package com.ness.controller;

import com.ness.Employee;
import com.ness.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.Map;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService emp;



    public void add_employee(Employee employee) throws Exception
    {
        emp.add_data(employee.getId(),employee.getName());

    }
    public void get_data()
    {
        emp.get_data();
    }
}
