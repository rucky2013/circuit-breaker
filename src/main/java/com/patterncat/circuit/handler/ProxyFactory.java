package com.patterncat.circuit.handler;

/**
 * Created by patterncat on 2016/4/21.
 */
public class ProxyFactory {
    public static <T> T proxyBean(Object target){
        return (T) new CircuitBreakerInvocationHandler(target).proxy();
    }
}
