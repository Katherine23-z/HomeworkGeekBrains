package com.company.homework6;

public class Main {

    public static void main(String[] args) {
        Animal cat = new Cat("Barsik");
        Animal cat1 = new Cat("Murzik");
        Animal cat2 = new Cat("Bubus");

        System.out.println(Cat.catsCounter());

        cat.run(50);
        cat.swim();

        cat1.run(100);
        cat1.swim(50);

        Animal dog = new Dog("Bobik");
        dog.swim(5);
        dog.run(100);

        Animal dog1 = new Dog("Drugok");
        dog1.swim(50);
        dog1.run(20);

        System.out.println(Dog.dogCounter());


    }
}


