package com.patterncat.circuit.service;

import com.patterncat.circuit.annotation.GuardByCircuitBreaker;

/**
 * Created by patterncat on 2016/4/21.
 */
public interface DemoService {

    @GuardByCircuitBreaker(noTripExceptions = {})
    public String getUuid(int idx);

    @GuardByCircuitBreaker(noTripExceptions = {IllegalArgumentException.class})
    public void illegalEx(int idx);
}
