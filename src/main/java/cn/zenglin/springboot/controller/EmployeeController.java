package cn.zenglin.springboot.controller;

import cn.zenglin.springboot.dao.EmployeeDao;
import cn.zenglin.springboot.entities.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.Collection;

@Controller
public class EmployeeController {


    EmployeeDao employeeDao;

    @GetMapping("/emps")
    public String list(Model model){
        employeeDao = new EmployeeDao();
        Collection<Employee> employees = employeeDao.getAll();
        model.addAttribute("emps",employees);
        return "emp/list";
    }
}
