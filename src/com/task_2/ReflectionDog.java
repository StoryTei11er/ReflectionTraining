package com.task_2;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class ReflectionDog implements InvocationHandler {

    private DogBehavior dog;

    public ReflectionDog(DogBehavior dog){
        this.dog = dog;
    }

    @Override
    public  Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("privet iz refleksii");
        return method.invoke(dog);
    }
}
