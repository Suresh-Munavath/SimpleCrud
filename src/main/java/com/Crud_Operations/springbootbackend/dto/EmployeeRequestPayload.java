package com.Crud_Operations.springbootbackend.dto;

import lombok.Data;
import lombok.Getter;

@Data
public class EmployeeRequestPayload {
    private String email;
    private String firstName;
    private String lastName;
}
