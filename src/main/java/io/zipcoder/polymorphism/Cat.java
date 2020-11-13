package io.zipcoder.polymorphism;

public class Cat extends Pet {
    public Cat(String petType, String petName) {
        super(petType, petName);
    }

    @Override
    public String speak() {
        return "Meow!";
    }
}
