package com.patterncat.circuit.exception;

/**
 * Created by patterncat on 2016/4/21.
 */
public class CircuitBreakerOpenException extends CircuitBreakerException{
    public CircuitBreakerOpenException(String message, Throwable cause) {
        super("The operation " + message + " has too many failures, tripping circuit breaker.",cause);
    }

    public CircuitBreakerOpenException(String message) {
        super("The operation " + message + " has too many failures, tripping circuit breaker.");
    }
}
