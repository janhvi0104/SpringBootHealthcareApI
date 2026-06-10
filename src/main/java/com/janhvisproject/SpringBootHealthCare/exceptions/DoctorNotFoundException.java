package com.janhvisproject.SpringBootHealthCare.exceptions;

public class DoctorNotFoundException extends RuntimeException {
    public DoctorNotFoundException(String message) {
	super(message);
    }
}
