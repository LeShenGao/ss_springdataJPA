package com.employee.domain;

import javax.persistence.*;

/**
 * 创建日期:2018年3月26日 下午2:02:56
 * 创建作者：liuzijie
 * 文件名称：Employee.java
 * 功能：
 * 修改记录：
 */
@Entity
@Table(name = "T_EMPLOYEE")
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "E_ID")
    private Integer id;

    @Column(name = "E_EMPNAME")
    private String empname;

    @Column(name = "E_SALARY")
    private Double salary;

    public Integer getid() {
        return id;
    }

    public void setid(Integer id) {
        this.id = id;
    }

    public String getEmpname() {
        return empname;
    }

    public void setEmpname(String empname) {
        this.empname = empname;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }
}