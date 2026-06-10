package com.janhvisproject.SpringBootHealthCare.exceptions;

public class InvalidPatientDataException extends RuntimeException {
    public InvalidPatientDataException(String message) {
        super(message);
    }
}
