package com.company.homework8;

public class Wall extends Barrier{
    private int heigh;


    public Wall(int heigh) {
        super();
        this.setHeigh(heigh);
    }


    public int getHeigh() {
        return heigh;
    }

    public void setHeigh(int heigh) {
        this.heigh = heigh;
    }
}
