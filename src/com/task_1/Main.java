package com.task_1;

import java.lang.reflect.Field;


public class Main {


    public static void main(String[] args) {

        Cat cat = new Cat.CatBuilder().withAge(2).withName("Sara").build();
        Field[] fields = cat.getClass().getDeclaredFields();
        for (Field field : fields) {
            field.setAccessible(true);
            MyAnnotation myAnnotation = field.getAnnotation(MyAnnotation.class);
            if (field.getType() == String.class) {
                try {
                    if (field.get(cat) == null) {
                        field.set(cat, myAnnotation.stringValue());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            } else {
                try {
                    if (field.get(cat).equals(0.0) || field.get(cat).equals(0)) {
                        field.set(cat, myAnnotation.intValue());
                    }
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }

        System.out.println(cat.getAge());
        System.out.println(cat.getName());
        System.out.println(cat.getSkinColor());
        System.out.println(cat.getWeight());
    }
}

