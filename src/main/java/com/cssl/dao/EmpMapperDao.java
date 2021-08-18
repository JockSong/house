package com.cssl.dao;

import com.cssl.pojo.Emp;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;

@Repository
public interface EmpMapperDao {

    public boolean insert(Emp emp);

    public List<HashMap<String,Object>> selectAll();

}
