package ru.appline;

import java.util.Scanner;

public class Converter_Final_Task1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double rate;
        double value;
        System.out.print("Курс доллара: ");
        rate = in.nextDouble();
        System.out.print("Количество рублей: ");
        value = in.nextDouble();
        value /= rate;
        System.out.printf("Итого: %.2f", value);
    }
}
