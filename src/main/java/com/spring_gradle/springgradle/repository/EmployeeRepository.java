package com.spring_gradle.springgradle.repository;

import com.spring_gradle.springgradle.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee,Integer>
{
    Employee findByName(String name);
}
