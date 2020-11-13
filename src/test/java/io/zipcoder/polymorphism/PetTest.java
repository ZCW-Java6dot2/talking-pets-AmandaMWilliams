package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class PetTest {

    @Test
    public void petConstructorTest(){
        // Given
        String expectedPetName = "Milo";
        String expectedPetType = "Dog";
        Pet pet = new Pet(expectedPetType, expectedPetName);

        // When
        String actualPetType = pet.getPetType();
        String actualPetName = pet.getPetName();

        // Then
        Assert.assertEquals(expectedPetType, actualPetType);
        Assert.assertEquals(expectedPetName, actualPetName);
    }

    @Test
    public void setNameTest(){
        // Given
        String expectedPetName = "Maya";
        Pet pet = new Pet(null, expectedPetName);

        // When
        pet.setPetName(expectedPetName);
        String actualPetName = pet.getPetName();

        // Then
        Assert.assertEquals(expectedPetName, actualPetName);
    }

    @Test
    public void setPetType(){
        // Given
        String expectedPetType = "Fish";
        Pet pet = new Pet(expectedPetType, null);

        // When
        pet.setPetType(expectedPetType);
        String actualPetType = pet.getPetType();

        // Then
        Assert.assertEquals(expectedPetType, actualPetType);
    }
}
