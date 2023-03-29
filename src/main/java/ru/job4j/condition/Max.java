package ru.job4j.condition;

public class Max {
    public static int max(int first, int second) {

        int result = first >= second ? first : second;
        return result;
    }

    public static int max(int first, int second, int third) {

        int result = max(first, second) >= third ? max(first, second) : third;
        return result;
    }

    public static int max(int first, int second, int third, int fourth) {

        int result = max(first, second, third) >= fourth ? max(first, second, third) : fourth;
        return result;
    }

    public static void main(String[] args) {

        int result = Max.max(-2, 2);
        System.out.println(result);
        result = Max.max(-2, 2, 3);
        System.out.println(result);
        result = Max.max(-2, 2, 3, 4);
        System.out.println(result);
    }

}
