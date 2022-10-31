package org.example.config;

import org.example.domain.Department;
import org.example.domain.Employee;
import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("emp")
    public Employee getEmp(){

        Employee emp = new Employee(getDept());
        emp.setEmpId(101);
        emp.setEmpName("Monali");
        emp.setSalary("60000");
        return emp;
    }

    @Bean
    public Department getDept(){

        return new Department(02,"IT");
    }
}
