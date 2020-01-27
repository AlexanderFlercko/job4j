package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        return value / 70;
    }
    public static int rubleToDollar(int value) {
        return value / 60;
    }
    public static int dollartoruble(int ruble) {
        return ruble * 60;
    }
    public static int eurotoruble(int ruble) {
        return ruble * 70;
    }
    public static void main(String[] args) {
        int euro = rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        int dollar = rubleToDollar(140);
        System.out.println("140 rubles are " + dollar + " dollar.");
        int ruble = dollartoruble(2);
        System.out.println("2 dollar are " + ruble + " ruble.");
        ruble = eurotoruble(2);
        System.out.println("2 euro are " + ruble + " ruble. ");
        int in = 140;
        int expected = 2;
        int expectedd = 120;
        int outE = rubleToEuro(in);
        int outD = rubleToDollar(in);
        int outd = ruble * 60;
        boolean passedE = expected == outE;
        boolean passedD = expected == outD;
        boolean passedd = outd == expectedd;
        System.out.println("140 rubles are 2 euro. Test result : " + passedE);
        System.out.println("140 rubles are 2 dollar. Test result : " + passedD);
        System.out.println("2 dollar are 140 rubles. Test result : " + passedd);
    }
}
