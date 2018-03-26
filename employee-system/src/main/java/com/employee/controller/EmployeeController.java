package com.employee.controller;

import com.employee.domain.Employee;
import com.employee.service.EmployeeService;
import com.employee.utils.EmpResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @RequestMapping(value = "/save", method = RequestMethod.POST)
    public EmpResult save(Employee employee) {
        try {
            employeeService.save(employee);
            return new EmpResult(true, "添加成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new EmpResult(false, "添加失败");
        }
    }

    @RequestMapping("/del")
    public EmpResult delete(Integer id) {
        try {
            employeeService.delete(id);
            return new EmpResult(true, "删除成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new EmpResult(false, "删除失败");
        }
    }

    @RequestMapping("/findAll")
    public List<Employee> findAll() {
        List<Employee> employees = employeeService.findAll();
        System.out.println(employees);
        return employees;
    }

    @RequestMapping("/findOne")
    public Employee findOne(@RequestParam Integer id) {
        Employee employee = employeeService.findOne(id);
        return employee;
    }

    @RequestMapping("/update")
    public EmpResult update(Employee employee) {
        try {
            employeeService.update(employee);
            return new EmpResult(true,"修改成功");
        } catch (Exception e) {
            e.printStackTrace();
            return new EmpResult(false,"修改失败");
        }
    }
}
