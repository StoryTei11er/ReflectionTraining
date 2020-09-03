package com.task_2;

public class Dog implements DogBehavior {

    @MyDogAnnotation
    @Override
    public void wagTheTail() {
        System.out.println("Повилял хвостом из класса Dog!");
    }

    @MyDogAnnotation
    @Override
    public void sayGaw(){
        System.out.println("Gaw-gaw!");
    }

    public void sitDown(){
        System.out.println("Ya sela");
    }
}
