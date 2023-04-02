package com.kabul.demo.Service;

import com.kabul.demo.Model.Employee;
import com.kabul.demo.Repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee saveEmployee(Employee employee){
        return employeeRepository.save(employee);
    }

    public List<Employee> listEmployees(){
        return employeeRepository.findAll();
    }
}
