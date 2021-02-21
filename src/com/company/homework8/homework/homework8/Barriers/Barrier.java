package homework.homework8.Barriers;

public  class Barrier {


     boolean overcoming(Moving mover, Barrier barrier){
         if(barrier instanceof RunRoad){
             mover.run();
             if(mover.getRunDistance() > ((RunRoad) barrier).getDistance()) {
                 System.out.println("Успешно!");
                 return true;
             } else {
                 System.out.println("Не добежал");
                 return false;
             }

         } else if (barrier instanceof Wall){
             mover.jump();
             if(mover.getJumpHeigh() > ((Wall) barrier).getHeigh()) {
                 System.out.println("Успешно!");
                 return true;
             }
             else {
                 System.out.println("Не перепрыгнул");
                 return false;
             }
         }return false;
     }


}
