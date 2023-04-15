package com.ness.service;

import com.ness.repository.EmployeeRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Map;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepo empRepo;

     public void add_data(int id,String name)
    {
        empRepo.getMap().put(id,name);
    }
    public void get_data()
    {
        for(Integer i:empRepo.getMap().keySet())
        {
            System.out.println(String.format("{ ID : %d  Name : %s }",i,empRepo.getMap().get(i)));
        }
    }


}
