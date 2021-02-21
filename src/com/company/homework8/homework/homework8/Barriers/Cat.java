package homework.homework8.Barriers;

public class Cat implements Moving {
    private String name;
    private int RunDistance;
    private int jumpHeigh;

    public Cat(String name, int runDistance, int jumpHeigh) {
        this.setName(name);
        this.setRunDistance(runDistance);
        this.setJumpHeigh(jumpHeigh);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRunDistance(int runDistance) {
        this.RunDistance = runDistance;
    }

    public void setJumpHeigh(int jumpHeigh) {
        this.jumpHeigh = jumpHeigh;
    }

    @Override
    public int getRunDistance() {
        return this.RunDistance;
    }

    @Override
    public int getJumpHeigh() {
        return this.jumpHeigh;
    }

    @Override
    public void run() {
        System.out.println(name + " пробежал " + RunDistance + " метров");

    }

    @Override
    public void jump() {
        System.out.println(name + " прыгнул на " + jumpHeigh + " метров");
    }
}
