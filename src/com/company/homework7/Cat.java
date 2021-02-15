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

        if(plate.getFood() >= appetite) {
            plate.decreaseFood(appetite);
            fullness = true;

        }

        }

    public void info(){
        System.out.println(name + " " +  appetite + " " +  fullness);
    }
}







