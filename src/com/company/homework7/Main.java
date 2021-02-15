package com.company.homework7;

public class Main {

    public static void main(String[] args) {

        Cat[] cat = new Cat[4];
        cat[0] = new Cat("Bars", 5);
        cat[1] = new Cat("Murz", 15);
        cat[2] = new Cat("Puh", 80);
        cat[3] = new Cat("Fluf", 6);

        Plate plate = new Plate(100);
        plate.info();

        for (Cat cat1 : cat) {
            if(cat1 != null) {
                cat1.catEat(plate);
                cat1.info();
            }
        }

        plate.info();
        System.out.println(plate.addFood(10));






    }

}
