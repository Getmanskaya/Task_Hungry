package org.example.animal;

public class Cat extends Pet {
    private static int countPet;

    public Cat(String name, int hunger) {
        super.name = name;
        super.hunger = hunger;
        countPet++;
    }

    public static int getCountPet() {
        return countPet;
    }

    public Cat() {
        countPet++;
    }
}

