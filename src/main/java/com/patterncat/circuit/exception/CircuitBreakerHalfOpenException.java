package com.patterncat.circuit.exception;

/**
 * Created by patterncat on 2016/4/21.
 */
public class CircuitBreakerHalfOpenException extends CircuitBreakerException{
    public CircuitBreakerHalfOpenException(String message) {
        super(message);
    }

    public CircuitBreakerHalfOpenException(String message, Throwable cause) {
        super(message, cause);
    }
}
