package io.zipcoder.polymorphism;

import java.util.ArrayList;

public class DisplayPrompts {

    public static void getNumberOfPetsOwned(){
        Integer numberOfPetsOwned = InputOutputConsole.getIntegerInput("How many pets do you have? \n");
        Object[] listOfPets = new Object[numberOfPetsOwned];
    }

    public static ArrayList<Pet> getPetTypesAndNames(Integer numberOfPetsOwned){
        ArrayList<Pet> pet = new ArrayList<Pet>();
        for (int i = 1; i < numberOfPetsOwned; i++) {
            String getPetType = InputOutputConsole.getStringInput("What kind of animal is pet " + i + "?  Dog, Cat, or Fish");
            if (getPetType.equalsIgnoreCase("dog")){
                String getPetName = InputOutputConsole.getStringInput("What is this dog's name?");
            } else if (getPetType.equalsIgnoreCase("cat")){
                String getPetName = InputOutputConsole.getStringInput("What is this cat's name?");
            } else if(getPetType.equalsIgnoreCase("fish")){
                String getPetName = InputOutputConsole.getStringInput("What is this fish's name?");
            } else {
                InputOutputConsole.println("Please enter a valid pet type: Dog, Cat, Fish");
            }
        } return pet;
    }
}