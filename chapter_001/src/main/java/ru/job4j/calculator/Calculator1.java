package ru.job4j.calculator;

public class Calculator1 {
    public static void plus(int first, int second) {
        int result = first + second;
        System.out.println(result);
    }
    public static void main(String[] args) {
        Calculator1.plus(100, 500);
        Calculator1.plus(4, 3);
        Calculator1.plus(3, 5);
    }
}
