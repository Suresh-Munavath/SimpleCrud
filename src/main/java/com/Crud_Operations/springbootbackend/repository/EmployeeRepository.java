package com.Crud_Operations.springbootbackend.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.Crud_Operations.springbootbackend.model.Employee;

public interface EmployeeRepository  extends JpaRepository<Employee,Long>
{



}
