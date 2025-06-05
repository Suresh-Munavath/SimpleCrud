package com.Crud_Operations.springbootbackend.exception;

import java.time.LocalDateTime;
import lombok.Getter;
import lombok.Setter;
public class ErrorResponse {
    private int status;
    private String message;


    public ErrorResponse(int status, String message) {
        this.status = status;
        this.message = message;

    }

    // Getters
    public int getStatus() {
        return status;
    }

    public String getMessage() {
        return message;
    }



    // Setters (optional)
    public void setStatus(int status) {
        this.status = status;
    }

    public void setMessage(String message) {
        this.message = message;
    }


}
