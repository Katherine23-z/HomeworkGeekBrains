package homework.homework8.Exceptions9;

public class Main {
    public static final int arrLength = 4;

    public static void main(String[] args) {

        String[][] str = {{"1", "3", "5", "%"}, {"0", "5", "4", "2"}, {"4", "7", "3", "8"}, {"2", "5", "3", "5"}};
        try {
            System.out.println(foo(str));
        } catch (MyArraySizeException e) {
            throw new MyArraySizeException("Неверный размер массива");
        }


    }


    public static int foo(String[][] arr) {
        int summ = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr.length != arrLength || arr[i].length != arrLength) {
                    throw new MyArraySizeException("Неверный размер массива");
                }
                if (!arr[i][j].matches("[0-9]+")) {
                    throw new MyArrayDataException(arr);
                } else {
                    int str = Integer.parseInt(arr[i][j]);
                    summ += str;

                }
            }

        }
        return summ;
    }
}

