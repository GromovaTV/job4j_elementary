package ru.job4j.array;

public class Turn {

    public static int[] back(int[] array) {
        int middle = (int) array.length / 2;
        int tmp = array[0];
        for (int i = 0; i < middle; i++) {
            tmp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = tmp;
        }
        return array;
    }

}
