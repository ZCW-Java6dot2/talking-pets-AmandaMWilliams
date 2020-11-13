package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class FishTest {

    @Test
    public void fishConstructorTest(){
        //Given
        String expectedPetType = "Fish";
        String expectedPetName = "Ruby";
        Fish fish = new Fish(expectedPetType, expectedPetName);

        //When
        String actualPetType = fish.getPetType();
        String actualPetName = fish.getPetName();

        //Then
        Assert.assertEquals(expectedPetName, actualPetName);
        Assert.assertEquals(expectedPetType, actualPetType);
    }
}
