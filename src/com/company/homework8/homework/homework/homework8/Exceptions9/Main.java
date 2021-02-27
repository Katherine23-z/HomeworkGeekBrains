package homework.homework8.Exceptions9;

public class Main {
    private static final int arrLength = 4;

    public static void main(String[] args) {

        String[][] str = {{"4", "24", "6", "%",}, {"5", "4", "6", "54"}, {"86", "5", "21", "5",}, {"54", "5", "6", "44"}};

        try{
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

