package homework.homework8.Types;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        String[] str = {"s","sdf","ff","sdf"};


        System.out.println(toList(str));

        swap(str, 0,1);
        System.out.println(Arrays.asList(str));

        Box <Apple> appleBox = new Box<>(new Apple(), new Apple());
        appleBox.addFruit(new Apple());

        System.out.println(appleBox.getWeight());

        Box <Apple> appleBox1 = new Box<>(new Apple(), new Apple(), new Apple(), new Apple());

        Box <Orange> orangeBox = new Box<>(new Orange(), new Orange(), new Orange());
        System.out.println(orangeBox.getWeight());

        System.out.println(appleBox.compare(orangeBox));
        System.out.println(appleBox.compare(appleBox1));

        appleBox.transferFruit(appleBox1);
        System.out.println(appleBox.getWeight());
        System.out.println(appleBox1.getWeight());


    }

    public static <T>List<T>  toList(T[] array){
        return Arrays.asList(array);
    }

    public static <T> void swap(T[] array, int i1, int i2){
        T element = array[i1];
        array[i1] = array[i2];
        array[i2] = element;
    }

}
