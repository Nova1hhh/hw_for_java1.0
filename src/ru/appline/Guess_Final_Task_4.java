package ru.appline;

import java.util.Scanner;

public class Guess_Final_Task_4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает. Что это?");
        String answer = "Заархивированный вирус";

        int count = 0;

        while (count < 3) {
            String guess = in.nextLine();
            switch (guess) {
                case "Подсказка": {
                    if (count != 0) {
                        System.out.println("Подсказка уже недоступна");
                    }
                    if (count == 0) {
                        System.out.println("Ну тут без шансов, сори");
                        guess = in.nextLine();
                        if (answer.equals(guess)) {
                            System.out.println("Правильно!");
                            return;
                        } else {
                            System.out.println("Обидно, приходи в другой раз");
                            return;
                        }
                    }
                }
                    break;
                case "Заархивированный вирус": {
                    System.out.println("Правильно!");
                    return;
                }
                default: {
                    if(count == 2 && !guess.equals(answer)) {
                        System.out.println("Обидно, приходи в другой раз");
                        return;
                    }
                    System.out.println("Подумай еще!");
                    count++;
                }

            }
        }


    }
}
