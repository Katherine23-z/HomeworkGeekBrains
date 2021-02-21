package homework.homework8.Exceptions9;

public class MyArrayDataException extends RuntimeException {
    private String[][] array;

    public MyArrayDataException(String[][] array) {
        this.array = array;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array.length; j++) {
                if(!array[i][j].matches("[0-9]+")){
                    System.err.println("Некорректное содержимое в ячейке " + "[" + i + "]" + "[" + j + "] - " + array[i][j]);
                }

            }

        }
    }
}

