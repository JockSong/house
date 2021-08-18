package com.cssl.service;

import com.cssl.pojo.Emp;

import java.util.HashMap;
import java.util.List;

public interface EmpService {
    public boolean add(Emp emp);

    public List<HashMap<String,Object>> selAll();

}
