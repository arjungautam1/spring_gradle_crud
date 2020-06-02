package com.spring_gradle.springgradle.controller;

import com.spring_gradle.springgradle.entity.Employee;
import com.spring_gradle.springgradle.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmployeeController {
    @Autowired
    private EmployeeService service;
    /*For post mapping*/
    @PostMapping("/addEmployee")
    public Employee addEmployee(@RequestBody Employee employee)
    {
        return service.saveEmployee(employee);
    }
    @PostMapping("/addEmployees")
    public List<Employee> addEmployee(@RequestBody List<Employee> employees)
    {
        return service.saveEmployees(employees);
    }
    /*for get mapping*/
    @GetMapping("/employeeById/{id}")
    public Employee findEmployeeById(@PathVariable int id)
    {
        return service.getEmployeeById(id);
    }
    @GetMapping("/employee/{name}")
    public Employee findEmployeeByName(@PathVariable String name)
    {
        return service.getEmployeeByName(name);
    }
    @PutMapping("/update")
    public Employee updateEmployee(@RequestBody Employee employee)
    {
        return service.updateEmployee(employee);
    }
    @DeleteMapping("/delete/{id}")
    public String deleteEmployee(@PathVariable int id)
    {
        return service.deleteEmployee(id);
    }


}
