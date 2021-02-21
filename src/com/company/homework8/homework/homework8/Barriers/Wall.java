package homework.homework8.Barriers;

import homework.homework8.Barriers.Barrier;

public class Wall extends Barrier {
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
