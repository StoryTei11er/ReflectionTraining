package com.task_2;


import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class Main {


    public static void main(String[] args) {
        DogBehavior dog = new Dog();
        DogBehavior reflectionDog = new ReflectionDog(dog);
        reflectionDog.sayGaw();

//        DogBehavior proxyDog = (DogBehavior) Proxy.newProxyInstance(Dog.class.getClassLoader(),
//                                                                    Dog.class.getInterfaces(),
//                                                                    new ReflectionDog(dog));
//
//
        Method[] methods = dog.getClass().getDeclaredMethods();
        for (Method method : methods) {
            method.setAccessible(true);
            if (method.isAnnotationPresent(MyDogAnnotation.class)) {
                try {
                    //Тут выпадет ошибка "IllegalArgumentException: object is not an instance of declaring class"
                    method.invoke(reflectionDog);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    method.invoke(dog);
                } catch (IllegalAccessException | InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
