package com.company.homework8;

public class Main {

    public static void main(String[] args) {

        Moving[] movers = new Moving[3];
        movers[0] = new Human("Fry", 5, 2);
        movers[1] = new Cat("Persik", 3, 7);
        movers[2] = new Robot("Bender", 50, 50);

        Barrier[] barriers = new Barrier[4];
        barriers[0] = new Wall(6);
        barriers[1] = new Wall(3);
        barriers[2] = new RunRoad(7);
        barriers[3] = new RunRoad(2);

        for (int i = 0; i < movers.length; i++) {
            boolean res;
            for (int j = 0; j < barriers.length; j++) {
                res = barriers[j].overcoming(movers[i],barriers[j]);
               if(!res){
                   break;
               }
            }

        }

    }

}
