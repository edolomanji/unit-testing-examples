package com.edolomanji.execution.exception;

public class MentorIsNotFreeException extends RuntimeException {

    public MentorIsNotFreeException(final String email) {
        super(String.format("Mentor with email: %s already works with intern", email));
    }
}
