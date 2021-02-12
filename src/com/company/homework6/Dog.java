package com.company.homework6;

public class Dog extends Animal {
    int maxRunDistance = 500;
    int maxSwimDistance = 10;
    static int dogCount = 0;


    public Dog(String name){
        super(name);
        dogCount++;

    }

    public static int dogCounter(){
        return dogCount;
    }

    @Override
    public void swim() {
        System.out.println("");
    }

    @Override
    public void swim(int distance) {
        if(distance < 0){
            System.out.println("Некорректная дистанция");
        }else if (distance > this.maxSwimDistance ) {
            System.out.println("Cобака не может столько проплыть");
        }else {
            System.out.println("Животное " + getName() + " проплыло " + distance + " метров");
        }
    }

    @Override
    public void run(int distance) {
        if(distance < 0){
            System.out.println("Некорректная дистанция");
        }else if (distance > this.maxRunDistance){
            System.out.println("Собака не может столько пробежать");
        }else
        super.run(distance);
    }
}
