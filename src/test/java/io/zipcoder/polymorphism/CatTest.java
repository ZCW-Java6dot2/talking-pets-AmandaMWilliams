package io.zipcoder.polymorphism;

import org.junit.Assert;
import org.junit.Test;

public class CatTest {

    @Test
    public void catConstructorTest(){
        //Given
        String expectedPetType = "Cat";
        String expectedPetName = "Mittens";
        Cat cat = new Cat(expectedPetType, expectedPetName);

        //When
        String actualPetType = cat.getPetType();
        String actualPetName = cat.getPetName();

        //Then
        Assert.assertEquals(expectedPetName, actualPetName);
        Assert.assertEquals(expectedPetType, actualPetType);
    }

}
