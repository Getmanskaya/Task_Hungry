package org.example.animal;

public class Dog extends Pet {
    private static int countPet;

    public Dog(String name, int hunger) {
        super.name = name;
        super.hunger = hunger;
        countPet++;
    }

    public static int getCountPet() {
        return countPet;
    }

    public Dog() {
        countPet++;
    }

 //   @Override
    void say() {
        System.out.println("Гав!");
    }
}
