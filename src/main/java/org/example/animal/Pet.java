package org.example.animal;


import org.example.exception.AnimalCanNoLongerEatException;
import org.example.foods.Food;

public abstract class Pet {
    protected String name;
    protected int hunger;

    public void eat(Food food) {
        if (hunger <= 0) {
            throw new AnimalCanNoLongerEatException(name+" переело");
        }
        hunger -= food.getSatiety();
        if ((hunger -= food.getSatiety()) <= 0) {
            System.out.println("Вы пытаетесь накормить "+name+" слишком сильно");
        }
    }

    public void eat(int i) {
        hunger -= i;
        if (hunger <= 0) {
            throw new AnimalCanNoLongerEatException("Животное переело");
        }
    }

}