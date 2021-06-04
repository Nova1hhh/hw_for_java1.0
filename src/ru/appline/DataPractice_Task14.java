package ru.appline;

import java.util.Arrays;


public class DataPractice_Task14 {
    public static void main(String[] args) {
        double[] array = new double[15];
        for (int i = 0; i < 15; i++){
            array[i] = Math.random() * 40 - 20;
        }
        System.out.println(Arrays.toString(array));
        double max = 0;
        double min = 0;
        for (int i = 0; i < 15; i++) {
            max = Math.max(max, array[i]);
            min = Math.min(min, array[i]);
        }
        System.out.printf("max: %f   min: %f\n", max, min);

        if (Math.abs(max) > Math.abs(min)) {
            System.out.println(max);
        } else
            System.out.println(min);
    }
}
