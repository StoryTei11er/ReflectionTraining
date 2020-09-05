package com.task_2;


public class ReflectionDog implements DogBehavior {

    private DogBehavior dog;

    public ReflectionDog(DogBehavior dog){
        this.dog = dog;
    }

    @Override
    public void wagTheTail() {
        System.out.println("Privet iz refleksii");
        dog.wagTheTail();
    }

    @Override
    public void sayGaw() {
        System.out.println("Privet iz refleksii");
        dog.sayGaw();
    }
}
