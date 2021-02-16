package com.company.homework7;

public class Plate {
    private int food;

    public Plate(int food){
        this.setFood(food);
    }

    public void setFood(int food) {
        this.food = food;
    }

    public int getFood() {
        return food;
    }

    public boolean decreaseFood(int countFood){
        if (food < countFood) {
            return false;
        }
        food -= countFood;
        return true;
    }

    public int addFood(int addFood){
        return food += addFood;
    }



    public void info(){
        System.out.println("plate " + getFood());
    }
}
