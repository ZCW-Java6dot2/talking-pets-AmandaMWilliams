package io.zipcoder.polymorphism;

public class Dog extends Pet {

    public Dog(String petType, String petName) {
        super(petType, petName);
    }

    @Override
    public String speak() {
        return "Woof!";
    }
}
