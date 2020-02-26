package ru.job4j.condition;

public class MultiMax {
    public static int max(int first, int second, int third) {
        int result = third > (first > second ? first : second) ? third : ((first > second) ? first : second);
        return result;
    }
    public static void main(String[] args) {
        int max = max(5,2,3);
        System.out.print(max);
    }
}
