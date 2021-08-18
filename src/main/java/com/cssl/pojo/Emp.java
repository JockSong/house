package com.cssl.pojo;

import lombok.Data;
import org.springframework.format.annotation.DateTimeFormat;

import java.io.Serializable;
import java.util.Date;

@Data
public class Emp implements Serializable {
    private Integer empno;
    private String ename;
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date hiredate;
    private Integer sal;
    private Integer deptno;
}
