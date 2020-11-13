package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class DogTest {

    @Test
    public void dogConstructorTest(){
        // Given
        String expectedPetType = "Dog";
        String expectedPetName = "Bingo";
        Dog dog = new Dog(expectedPetType, expectedPetName);

        // When
        String actualPetType = dog.getPetType();
        String actualPetName = dog.getPetName();

        // Then
        Assert.assertEquals(expectedPetName, actualPetName);
        Assert.assertEquals(expectedPetType, actualPetType);
    }

    @Test
    public void dogSpeakTest(){
        // Given
        Dog dog = new Dog(null, null);
        String expectedSpeakOutput = "Woof!";

        // When
        String actualSpeakOutput = dog.speak();

        // Then
        Assert.assertEquals(expectedSpeakOutput, actualSpeakOutput);
    }
}
