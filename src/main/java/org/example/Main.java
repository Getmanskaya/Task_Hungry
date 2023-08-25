package org.example;

import org.example.animal.Cat;
import org.example.animal.Dog;
import org.example.foods.Pizza;

public class Main {
    public static void main(String[] args) {
       Cat timon = new Cat("Timon", 18);
       Dog kuzya = new Dog("Кузя", 18);

        Pizza margarita = new Pizza(5,3);
        Pizza myasnay = new Pizza(5,1);

        timon.eat(margarita);
        kuzya.eat(18);

//       animal.Cat tihon = new animal.Cat("Tihon", 15);
//       animal.Cat tom = new animal.Cat("Tom", 15);

//       animal.Cat dysya = new animal.Cat();
//       animal.Cat mysya = new animal.Cat();
//       timon.say();

//       System.out.println(animal.Cat.getCountPet());


//       animal.Dog kuzya = new animal.Dog("Кузя", 18);
//       animal.Dog myhtar = new animal.Dog();

//       myhtar.say();

//       System.out.println(animal.Dog.getCountPet());
//
//        Pizza margarita = new Pizza(5,3);
//        Pizza myasnay = new Pizza(5,1);

        System.out.println(margarita.getSatiety());
        System.out.println(myasnay.getSatiety());

    }
}