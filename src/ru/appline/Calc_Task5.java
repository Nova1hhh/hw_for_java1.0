package ru.appline;

import java.util.Scanner;

public class Calc_Task5 {
    public static void main(String[] args) {
        double a, b;
        Scanner in = new Scanner(System.in);
        System.out.println("Введите 2 числа");
        a = in.nextDouble();
        b = in.nextDouble();
        System.out.println("Введите операцию");
        String op = in.next();
        switch (op) {
            case "*" -> System.out.println(a * b);
            case "+" -> System.out.println(a + b);
            case "-" -> System.out.println(a - b);
            case "/" -> System.out.println(a / b);
        }
    }
}
