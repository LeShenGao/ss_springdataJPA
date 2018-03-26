package com.employee.service;

import com.employee.domain.Employee;

import java.util.List;

public interface EmployeeService {
    /**
     * 添加员工
     *
     * @param employee
     */
    void save(Employee employee);

    /**
     * 根据员工id删除员工
     *
     * @param id
     */
    void delete(Integer id);

    /**
     * 查询所有员工
     *
     * @return
     */
    List<Employee> findAll();

    /**
     * 根据id查询员工信息
     *
     * @param id
     * @return
     */
    Employee findOne(Integer id);

    /**
     * 修改员工信息
     *
     * @param employee
     */
    void update(Employee employee);
}
