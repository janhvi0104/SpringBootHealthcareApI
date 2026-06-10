package com.janhvisproject.SpringBootHealthCare.exceptions;

public class InvalidDoctorDataException extends RuntimeException {
    public InvalidDoctorDataException(String message) {
	super(message);
    }
}
