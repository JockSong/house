package com.cssl.service.impl;

import com.cssl.dao.EmpMapperDao;
import com.cssl.pojo.Emp;
import com.cssl.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;

@Transactional
@Service
public class EmpServiceImpl implements EmpService {
    @Autowired
    private EmpMapperDao e;

    @Override
    public boolean add(Emp emp) {
        return e.insert(emp);
    }

    @Override
    public List<HashMap<String, Object>> selAll() {
        return e.selectAll();
    }
}
