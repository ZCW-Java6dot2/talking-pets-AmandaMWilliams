package io.zipcoder.polymorphism;

public class Fish extends Pet{
    public Fish(String petType, String petName) {
        super(petType, petName);
    }

    @Override
    public String speak() {
        return "Glub glub!";
    }
}
