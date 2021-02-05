package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static char [][] map;
    public static final int SIZE = 5;
    public static final char EMPTY_DOT = '*';
    public static final char USER_DOT = 'X';
    public static final char AI_DOT = '0';

    public static Scanner scanner = new Scanner(System.in);
    public static Random random = new Random();


    public static void main(String[] args){

        createAndInitMap();
        printMap();

        while (true){
            humanTurn();
            printMap();
            if (isEndGame(USER_DOT, "Игрок победил")) {
                break;
            }
            aiTurn();
            printMap();
            if (isEndGame(AI_DOT, "Компьютер победил")) {
                break;
            }

        }
        System.out.println("Игра окончена");
    }


    private static void createAndInitMap() {
            map = new char[SIZE][SIZE];
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    map[i][j] = EMPTY_DOT;
                }
            }

        }

    private static void printMap() {
        for (int i = 0; i <= map.length; i++) {
            if(i==0){
                System.out.print('\t');
            } else if(i < 10){
                System.out.print("  " + i  + " ");
            } else {
                System.out.print(" " + i + " ");
            }
        }
        System.out.println();
        for (int i = 0; i < map.length; i++) {
            if(i < 9){
                System.out.print("  " + (i + 1)  + "\t" );
            } else {
                System.out.print(" " + (i + 1) + "\t");
            }
            for (int j = 0; j < map.length; j++) {
                System.out.print("  " + map[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void humanTurn() {
        int x, y;
        do{
            System.out.println("Введите координаты в формате x, y");
            x = scanner.nextInt();
            y = scanner.nextInt();
        }while (isNotValidCell(x, y));

        map[x-1][y-1] = USER_DOT;
    }

    private static void aiTurn() {
        int x, y;
        do{
            x = random.nextInt(map.length);
            y = random.nextInt(map.length);
        } while (isNotValidCell(x, y));

            map[x][y] = AI_DOT;
        System.out.println("Компьютер занял ячейку " + x + " " + y + " ");

    }

    private static boolean isNotValidCell(int x, int y) {
        if(x < 0 || x >= map.length || y < 0 || y >= map.length){
            return true;
    } else if(map[x][y] == EMPTY_DOT){
            return false;
        }
        return true;
    }

    private static boolean isEndGame(char dot, String message){
        if (checkWin(dot)){
            System.out.println(message);
            return true;
        }else if (isMapFull()){
            System.out.println("Ничья!");
            return true;
        }
        return false;
    }

    private static boolean checkWin(char dot) {
        if(checkRow(dot)){
            return true;
        } else if (checkColumn(dot)){
            return true;
        }else if (checkDiagonal(dot)){
            return true;
        }
        return false;
    }

    private static boolean checkDiagonal(char dot) {
        int len = map.length-1;
        for (int i = 0; (i+3) < map.length; i++) {
            for (int j = 0; (j+3) < map.length; j++) {
                if (map[i][j] == dot && map[i+1][j+1] == dot && map[i+2][j+2] == dot && map[i+3][j+3] == dot ){
                    return true;
                } else if
                (map[i][len - j] == dot && map[i+1][len -(j+1)] == dot
                                && map[i+2][len - (j+2)] == dot && map[i+3][len - (j+3)] == dot) {
                    return true;
                }
            }

            }
        return false;
        }



    private static boolean checkColumn(char dot) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; (j + 3) < map.length; j++) {
                if (map[j][i] == dot && map[j+1][i] == dot && map[j+2][i] == dot && map[j+3][i] == dot) {
                    return true;
                }
            }
        }return false;
    }

    private static boolean checkRow(char dot) {
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; (j + 3) < map.length; j++) {
                if (map[i][j] == dot && map[i][j + 1] == dot && map[i][j + 2] == dot && map[i][j + 3] == dot) {
                    return true;
                }
            /*if(map[i][0] == dot && map[i][1] == dot && map[i][2] == dot && map[i][3] == dot){
                return true;
            }else if(map[i][0] == dot && map[i][1] == dot && map[i][2] == dot && map[i][3] == dot){
                return true;
            }*/
            }

        }return false;
    }


        private static boolean isMapFull() {
            for (int i = 0; i < map.length; i++) {
                for (int j = 0; j < map.length; j++) {
                    if (map[i][j] == EMPTY_DOT) {
                        return false;
                    }
                }
            }
            return true;
        }
    }

