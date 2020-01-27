package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double first = Math.pow(x1 - x2, 2);
        double second = Math.pow(y1 - y2, 2);
        return Math.sqrt(first + second);

    }
    public static void main(String[] args) {
        double result = distance(8, 6, 4, 3);
        System.out.println("result (8, 4) to (6, 3) " + " = " + result);
    }
}
