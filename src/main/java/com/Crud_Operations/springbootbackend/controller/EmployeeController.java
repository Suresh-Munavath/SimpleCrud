package com.Crud_Operations.springbootbackend.controller;

import com.Crud_Operations.springbootbackend.dto.EmployeeRequestPayload;
import com.Crud_Operations.springbootbackend.model.Employee;
import com.Crud_Operations.springbootbackend.Services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@CrossOrigin("*")

@RequestMapping("/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;
    @ResponseBody
    @RequestMapping("/front-end")
    public String respond()
    {
        return "Welcome!,to Basic Crud Operations Project";
    }

    @PostMapping("/add")
    public Employee createEmployee(@RequestBody EmployeeRequestPayload employee) {
        return employeeService.createEmployee(employee);
    }


    @GetMapping("/find")
    public List<Employee> getEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}/findOne")
    public ResponseEntity<Employee> getOneEmployee(@PathVariable Long id)
    {
        Employee e=employeeService.getEmployeeDetails(id);
        return ResponseEntity.ok(e);
    }

    @PutMapping("/{id}/update")
    public ResponseEntity<String> updateEmployee(
            @PathVariable Long id,
            @RequestBody EmployeeRequestPayload updatedData) {
        String message = employeeService.updateEmployee(id, updatedData);
        return ResponseEntity.ok(message);
    }

    @DeleteMapping("/{id}/delete")
    public ResponseEntity<String> deleteEmployee(@PathVariable Long id) {
        String message = employeeService.deleteEmployee(id);
        return ResponseEntity.ok(message);
    }
//    @GetMapping("/excp")
//    public ResponseEntity<String> exceptionroute(@PathVariable Long id) {
//        throw new NullPointerException("Error");
//    }
}
