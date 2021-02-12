package com.company.homework6;

public abstract class Animal {
    private String name;
    private static int animalCounter;

    public Animal(String name) {
        this.setName(name);
        animalCounter++;
    }

    public static int getAnimalCounter(){
        return animalCounter;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract void swim();


    public abstract void swim(int distance);

    public void run(int distance){
        System.out.println("Животное " + name + " пробежало " + distance + " метров");
    }


}
