package DataSystem;

public class Main {

    /*1.1 Пример алгоритма из жизни - приготовление любого блюа(последовательность действий и является алгоритмом)
        Пример структуры данных - очередь в магазине, или картотека;
      1.2 Пример алгоритма в программировании - калькулятор: вносится значение переменных, производится математическая операция, выводится результат;
          Пример структуры данных - связанный список ArrayList.

     */

    public static void main(String[] args) {

        Student[] students = new Student[4];
        students[0] = new Student("Ivan", 25);
        students[1] = new Student("Peter", 18);
        students[2] = new Student("Alex", 19);
        students[3] = new Student("Dennis", 23);

        long start = System.nanoTime();
        for (int i = 0; i < students.length; i++) {
            if(students[i].getAge() > 20){
                students[i].info();
            }
        }

        long finish = System.nanoTime();
        System.out.println(finish-start);





    }
}
