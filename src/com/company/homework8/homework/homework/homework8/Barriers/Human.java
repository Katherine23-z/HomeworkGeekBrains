package homework.homework8.Barriers;

public class Human implements Moving {
    private String name;
    private int runDistance;
    private int jumpHeigh;

    public Human(String name, int runDistance, int jumpHeigh) {
        this.name = name;
        this.setRunDistance(runDistance);
        this.setJumpHeigh(jumpHeigh);
    }

    @Override
    public void run() {
        System.out.println(name + " пробежал " + runDistance + " метров");
    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул на " + jumpHeigh + " метров");
    }

    @Override
    public int getRunDistance() {
        return this.runDistance;
    }

    @Override
    public int getJumpHeigh() {
        return this.jumpHeigh;
    }

    public void setRunDistance(int runDistance) {
        this.runDistance = runDistance;
    }

    public void setJumpHeigh(int jumpHeigh) {
        this.jumpHeigh = jumpHeigh;
    }


    public void setName(String name) {
        this.name = name;
    }


}
