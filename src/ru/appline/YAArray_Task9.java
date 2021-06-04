package ru.appline;

import java.util.Arrays;
import java.util.Scanner;

public class YAArray_Task9 {
    public static void main(String[] args) {
        System.out.println("Введите размер массива");
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        System.out.println("Введите элементы массива");
        double[] array = new double[len];
        double sum = 0;
        for (int i = 0; i < len; i++){
            array[i] = in.nextDouble();
            sum += array[i];
        }
        //System.out.println(Arrays.toString(array));
        double average = sum / array.length;
        for(double i : array) {
            System.out.print(i * average + " ");
        }
    }
}
