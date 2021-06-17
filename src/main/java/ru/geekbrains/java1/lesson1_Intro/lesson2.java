package ru.geekbrains.java1.lesson1_Intro;

public class lesson2 {
    // Задача 1
    private static boolean TwoNumbers (int first, int second) {
        int sum = first + second;
        boolean resalt = sum <= 20 && sum >= 10;
        return sum <= 20 && >= 10;
    }
    // Задача 2
    private static void isPositive(long variable){
        System.out.println(variable >= 0 ? "Positive" : "Negative");
    }

    // Задача 3
    private static boolean isPositive(int variable) {
        return variable >= 0;
    }

    // Задача 4
    private static boolean isNegative(int number) {
        return number < 0;
    }

    // Задача 5
    private static void println (String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }

}
