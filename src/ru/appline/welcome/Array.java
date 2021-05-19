package ru.appline.welcome;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[] {1,2,3,4,5};
        System.out.println(Arrays.toString(array));
        int tmp;
        tmp = array[array.length - 1];
        array[array.length - 1] = array[0];
        array[0] = tmp;
        System.out.println(Arrays.toString(array));
        tmp = array[array.length / 2];
        System.out.println(array[0] + tmp);
    }
}
