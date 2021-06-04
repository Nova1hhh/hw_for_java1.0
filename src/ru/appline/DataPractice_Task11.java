package ru.appline;

import java.util.Scanner;

public class DataPractice_Task11 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 1е число");
        String a = in.next();
        System.out.println("Введите 2е число");
        int b = in.nextInt();

        a = a.replace(',', '.');

        if (Double.parseDouble(a) > b) {
            System.out.println("Большее число: " + Double.parseDouble(a));
            System.out.println((double) b);
        } else {
            System.out.println("Большее число: " + b);
            System.out.println(Double.parseDouble(a));
        }

    }
}
