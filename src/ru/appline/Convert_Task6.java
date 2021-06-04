package ru.appline;

import java.util.Scanner;

public class Convert_Task6 {
    public static void main(String[] args) {
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        if (a == 1) {
            System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");
            int b = in.nextInt();
            System.out.println("Введите число");
            double value = in.nextDouble();
            switch (b) {
                case 1 -> System.out.printf("Результат:\nМетры: %f\nМили: %f\nЯрды: %f\nФуты: %f", value, value / 1609, value * 1.094, value * 3.281);
                case 2 -> System.out.printf("Результат:\nМетры: %f\nМили: %f\nЯрды: %f\nФуты: %f", value * 1609, value, value * 1760, value * 5280);
                case 3 -> System.out.printf("Результат:\nМетры: %f\nМили: %f\nЯрды: %f\nФуты: %f", value / 1.094, value / 1760, value, value * 3);
                case 4 -> System.out.printf("Результат:\nМетры: %f\nМили: %f\nЯрды: %f\nФуты: %f", value / 3.281, value / 5280, value / 3, value);
            }
        } else if (a == 2) {
            System.out.println("Выберите единицу измерения: 1 - грамм, 2 - стон, 3 - фунт, 4 - унция");
            int b = in.nextInt();
            System.out.println("Введите число");
            double value = in.nextDouble();
            switch (b) {
                case 1 -> System.out.printf("Результат:\nграммы: %f\nстоны: %f\nфунты: %f\nунции: %f", value , value / 6350, value / 454, value / 28.35);
                case 2 -> System.out.printf("Результат:\nграммы: %f\nстоны: %f\nфунты: %f\nунции: %f", value * 6350, value , value * 14, value * 224);
                case 3 -> System.out.printf("Результат:\nграммы: %f\nстоны: %f\nфунты: %f\nунции: %f", value * 454, value / 14, value , value * 16);
                case 4 -> System.out.printf("Результат:\nграммы: %f\nстоны: %f\nфунты: %f\nунции: %f", value * 28.35, value / 224, value / 16, value );
            }
        } else System.out.println("Сори, не такого :)");
    }
}
