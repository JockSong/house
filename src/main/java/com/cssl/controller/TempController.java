package com.cssl.controller;


import com.cssl.pojo.Emp;
import com.cssl.service.EmpService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class TempController {

    @Autowired
    private EmpService e;

    @PostMapping("/insert")
    public String add(Emp emp){
        if(e.add(emp))
            return "redirect:succes";
        return "error";
    }


    @RequestMapping("/succes")
    public String selectall(@RequestParam(defaultValue = "1") int pageIndex, Model model){
        PageHelper.startPage(pageIndex,3);
        model.addAttribute("list",e.selAll());
        model.addAttribute("index",pageIndex);
        return  "temp";
    }

}
