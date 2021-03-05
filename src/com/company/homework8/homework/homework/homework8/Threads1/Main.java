package homework.homework8.Threads1;


import java.util.Arrays;

public class Main {
    static final int SIZE = 10000000;
    static final int HALF = SIZE / 2;

    public static void main(String[] args) {
        float[]arr = new float[SIZE];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }

        arrayTimeCounter(arr);

        twoThreadsTimeCounter(arr);




    }

    private static void twoThreadsTimeCounter(float[] arr) {
        float[] array1 = new float[HALF];
        float[] array2 = new float[HALF];

        long a = System.currentTimeMillis();
        System.arraycopy(arr, 0, array1, 0, HALF);
        System.arraycopy(arr, HALF, array2, 0, HALF);

        Thread thread1 = new Thread(() -> calculate(array1));
        Thread thread2 = new Thread(() -> calculate(array2));

        thread1.start();
        thread2.start();

        try {
            thread1.join();
            thread2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.arraycopy(array1, 0, arr, 0, HALF);
        System.arraycopy(array2, 0, arr, HALF, HALF);

        long b = System.currentTimeMillis();
        long result = b-a;
        System.out.println(result);
    }

    private static void arrayTimeCounter(float[] array) {
        long a = System.currentTimeMillis();
        Thread thread = new Thread(new Runnable() {
            @Override
            public void run() {
                calculate(array);
            }
        });
        thread.start();
        try {
            thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        long b = System.currentTimeMillis();
        long result = b-a;
        System.out.println(result);
    }

    public static float[] calculate(float[] array){
        for (int i = 0; i < array.length; i++) {
            array[i] = (float)(array[i] * Math.sin(0.2f + i / 5) * Math.cos(0.2f + i / 5) * Math.cos(0.4f + i / 2));
        }
        return array;
    }
}
