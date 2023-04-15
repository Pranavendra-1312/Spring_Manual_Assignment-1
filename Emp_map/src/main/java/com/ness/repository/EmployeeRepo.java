package com.ness.repository;

import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeRepo {

    Map<Integer,String> map=new HashMap<>();

    public Map<Integer, String> getMap() {
        return map;
    }


}
