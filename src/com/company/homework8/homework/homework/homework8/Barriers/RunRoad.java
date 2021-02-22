package homework.homework8.Barriers;

import homework.homework8.Barriers.Barrier;

public class RunRoad extends Barrier {
    private int distance;

    public RunRoad(int distance) {
        super();
        this.setDistance(distance);
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }


}
