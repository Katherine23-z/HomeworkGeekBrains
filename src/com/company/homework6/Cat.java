package com.company.homework6;

public class Cat extends Animal {
    int maxRunDistance = 200;
    static int catsCount = 0;



    public Cat(String name) {
        super(name);
        catsCount++;
    }

    public static int catsCounter(){
        return catsCount;
    }

    @Override
    public void swim() {
        System.out.println("Кот " + getName() + "  не плавает");
    }

    @Override
    public void swim(int distance) {
        if(distance > 0)
        System.out.println("Кот " + getName() + " не плавает");
    }

    @Override
    public void run(int distance) {
        if(distance < 0){
            System.out.println("Некорректная дистанция");
        }else if (distance > this.maxRunDistance ){
            System.out.println("Кот не может столько пробежать");
        }else {
            super.run(distance);
        }

    }
}
