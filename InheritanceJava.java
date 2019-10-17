package com.example.inheritancejava;

public class InheritanceJava {
    public static void main(String[] args) {

        Animal animal = new Animal("Animal", 1, 1, 5,5);

        Dog dog = new Dog("Yorkie", 8, 20, 2, 4, 1, 20, "Long silky");
        dog.eat();
        System.out.println("");
        dog.walk();
        System.out.println("");
        dog.run();
        System.out.println("");
        Fish fish = new Fish("Nemo", 1, 1, 4, 11, 4, 2, 1);
        fish.getName();
        System.out.println("");
        fish.setName("Wanda");
    }
}

