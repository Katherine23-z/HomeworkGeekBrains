package com.company.homework8;

public class Robot implements Moving{
    private String name;
    private int runDistance;
    private int jumpHeigh;

    public Robot(String name, int runDistance, int jumpHeigh) {
        this.setName(name);
        this.setRunDistance(runDistance);
        this.setJumpHeigh(jumpHeigh);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public void setJumpHeigh(int jumpHeigh) {
        this.jumpHeigh = jumpHeigh;
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeigh() {
        return this.jumpHeigh;
    }

    @Override
    public void run() {
        System.out.println(name + " пробежал " + runDistance + " метров");
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул на " + jumpHeigh + " метров");
    }
}
