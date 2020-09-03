package com.task_1;

public class Cat {

    @MyAnnotation
    private String name;

    @MyAnnotation
    private int age;

    @MyAnnotation
    private double weight;

    @MyAnnotation
    private String skinColor;


    private Cat() {
    }


    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getWeight() {
        return weight;
    }

    public String getSkinColor() {
        return skinColor;
    }


    public static class CatBuilder {

        private Cat newCat;


        public CatBuilder() {
            newCat = new Cat();
        }

        public CatBuilder withName(String name) {
            newCat.name = name;
            return this;
        }

        public CatBuilder withAge(int age) {
            newCat.age = age;
            return this;
        }

        public CatBuilder withWeight(double weight) {
            newCat.weight = weight;
            return this;
        }

        public CatBuilder withSkinColor(String skinColor) {
            newCat.skinColor = skinColor;
            return this;
        }

        public Cat build() {
            return newCat;
        }
    }
}
