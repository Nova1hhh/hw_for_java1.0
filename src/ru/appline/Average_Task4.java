package ru.appline;

import java.util.Scanner;

public class Average_Task4 {
    public static void main(String[] args) {
        double a, b, c;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите числа: ");
        a = in.nextDouble();
        b = in.nextDouble();
        c = in.nextDouble();
        double average = (a + b + c) / 3;
        average = Math.floor(average / 2);
        if (average > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
