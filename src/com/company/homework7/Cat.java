package com.company.homework7;

public class Cat {
    private String name;
    private int appetite;
    boolean fullness;

    public Cat(String name, int appetite){
        this.name = name;
        this.appetite = appetite;
        this.fullness = false;
    }

    public void catEat(Plate plate){
        fullness = plate.decreaseFood(appetite);
        }

    public void info(){
        System.out.println(name + " " +  appetite + " " +  fullness);
    }
}







