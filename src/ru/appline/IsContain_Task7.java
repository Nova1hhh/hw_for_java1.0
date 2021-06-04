package ru.appline;

import java.util.Arrays;
import java.util.Scanner;

public class IsContain_Task7 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите размер массива");
        int len = in.nextInt();
        System.out.println("Введите элементы массива");
        double[] array = new double[len];
        for(int i = 0; i < len; i++){
            array[i] = in.nextDouble();
        }
        double x = 2.5;
        double y = 4;
        double z = -2.28;
        //System.out.println(Arrays.toString(array));

        int a = Arrays.binarySearch(array, x);
        int b = Arrays.binarySearch(array, y);
        int c = Arrays.binarySearch(array, z);

        if (a > 0 || b > 0 || c > 0) {
            System.out.println("Данное значение имеется в константах");
        }
    }
}
