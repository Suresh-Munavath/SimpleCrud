package com.Crud_Operations.springbootbackend.Services;

import com.Crud_Operations.springbootbackend.dto.EmployeeRequestPayload;
import com.Crud_Operations.springbootbackend.model.Employee;
import com.Crud_Operations.springbootbackend.repository.EmployeeRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.Crud_Operations.springbootbackend.exception.ResourceNotFoundException;

import java.util.List;

@Service
public class EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    public Employee createEmployee(EmployeeRequestPayload employeePayload) {
        Employee employee = new Employee(
                0L,
                employeePayload.getFirstName(),
                employeePayload.getLastName(),
                employeePayload.getEmail()
        );
        return employeeRepository.saveAndFlush(employee);
    }

    public List<Employee> getAllEmployees()
    {

        return employeeRepository.findAll();
    }
    public Employee getEmployeeDetails(Long id)
    {
        Employee emp=employeeRepository.findById(id).
                orElseThrow(()->new ResourceNotFoundException("Employee with ID Number: "+id+" is not found"));
        return emp;
    }

    public String updateEmployee(Long id, EmployeeRequestPayload updatedData) {
        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found"));

        existing.setFirstName(updatedData.getFirstName());
        existing.setLastName(updatedData.getLastName());
        existing.setEmail(updatedData.getEmail());

        employeeRepository.saveAndFlush(existing);
        return "Employee details updated successfully";
    }

    public String deleteEmployee(Long id) {
        Employee existing = employeeRepository.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Employee not found with id: " + id));

        employeeRepository.deleteById(id);
        return "Employee deleted successfully.";
    }
}
