package com.patterncat.circuit.exception;

/**
 * Created by patterncat on 2016/4/21.
 */
public class CircuitBreakerException extends RuntimeException{
    public CircuitBreakerException(String message) {
        super(message);
    }

    public CircuitBreakerException(String message, Throwable cause) {
        super(message, cause);
    }
}
