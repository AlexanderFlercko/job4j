package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double ac, double bc) {
        if (ab + ac > bc && ab + bc > ac && ac + bc > ab) {
            return true;
        }
        else {
            return false;
        }
    }
    public static void main(String[] args) {
        boolean result = Triangle.exist(2, 2, 2);
        System.out.print(result);
    }
}
