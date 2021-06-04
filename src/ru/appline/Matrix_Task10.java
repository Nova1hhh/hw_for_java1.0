package ru.appline;

import java.util.Arrays;
import java.util.Scanner;

public class Matrix_Task10 {
    public static void main(String[] args) {
        System.out.println("Введите размерность матрицы, сначала кол-во строк, потом столбцов");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int m = in.nextInt();
        System.out.println("Введите элементы массива");
        double[][] matrix = new double[n][m];
        for (int i = 0; i < n; i++){
            for (int j = 0; j < m; j++){
                matrix[i][j] = in.nextDouble();
            }
        }
      //  System.out.println(Arrays.deepToString(matrix));
        for (int i = 0; i < m; i++) {
            System.out.print(matrix[0][i] * 3 + " ");
        }
    }
}
