package io.zipcoder.polymorphism;

public class Pet {

    private String petName;
    private String petType;

    public Pet(String petType, String petName) {
        this.petType = petType;
        this.petName = petName;
    }

    public void setPetName(String petName) {
        this.petName = petName;
    }

    public void setPetType(String petType) {
        this.petType = petType;
    }

    public String getPetType() {
        return petType;
    }

    public String getPetName() {
        return petName;
    }
}

