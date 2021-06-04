package ru.appline;

import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class DataPractice_Task13 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String str = in.nextLine();
       // System.out.println(str);

        Pattern pattern = Pattern.compile("[a-zA-Z]");
        Pattern pat1 = Pattern.compile("[0-9]");
        Pattern pat2 = Pattern.compile("[а-яА-Я]");
        String[] words = str.split(" ");
        int count = 0;
        for (String oneWord : words){
            Matcher matcher = pattern.matcher(oneWord);
            if (matcher.find()) {
                Matcher matcher1 = pat1.matcher(oneWord);
                Matcher matcher2 = pat2.matcher(oneWord);
                if (!matcher1.find() && !matcher2.find()) {
                    System.out.println(oneWord);
                    count++;
                }
            }
        }
        System.out.printf("Всего слов на латинице: %d", count);
    }

}
