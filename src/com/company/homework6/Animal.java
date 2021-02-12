package com.company.homework6;

public abstract class Animal {
    private String name;

    public Animal(String name) {
        this.setName(name);
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
