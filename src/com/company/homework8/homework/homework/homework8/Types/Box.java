package homework.homework8.Types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Box <T extends Fruit> {
    private List<T> box;

    public Box(T ...fruit) {
        this.box = new ArrayList<T>(Arrays.asList(fruit));
    }

    public void addFruit(T fruit){
        box.add(fruit);
    }

    public float getWeight(){
        float weight = 0;
        for (T t : box) {
            weight += t.getWeight();
        }return weight;
    }

    public boolean compare(Box<?> box){
        if(Float.compare(this.getWeight(), box.getWeight()) == 0){
    return true;
        }
        return false;
    }

    public void transferFruit(Box<T> anotherBox){
        if(anotherBox == this) return;

        anotherBox.box.addAll(box);
        box.clear();
    }


}
