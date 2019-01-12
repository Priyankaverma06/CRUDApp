package com.example;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.Employee;

@Repository
public interface EmployeRepository extends CrudRepository<Employee, Long> {}
