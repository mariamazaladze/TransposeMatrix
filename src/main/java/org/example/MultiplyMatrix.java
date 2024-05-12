package org.example;

import java.util.Arrays;

/**
 * ორი მატრიცის ნამრავლი
 * Description
 * Please, proceed to MultiplyMatrix class and implement its multiply method.
 * It takes two rectangular integer arrays (matrices) and returns the result of their multiplication.
 * Consider two integer matrices represented as rectangular arrays. The task is to multiply given matrices.
 * The definition of matrix multiplication indicates a row-by-column multiplication,
 * where the entries in the i-th row of A are multiplied by the corresponding entries in the j-th column of B
 * and then the ij-th element of the resulting matrix is the sum of that multiplication results.
 * Note that it is guaranteed that the number of columns in the first matrix is equal to the number of rows in the second matrix.
 */
public class MultiplyMatrix {
    public static int[][] multiply(int[][] matrix1, int[][] matrix2) {
        int row = matrix1.length;
        int columns = matrix2[0].length;

        int[][] result = new int[matrix1.length][matrix2[0].length];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = 0;
                for (int k = 0; k < result.length; k++) {
                    result[i][j] = result[i][j] + (matrix1[i][k] * matrix2[k][j]);
                }
            }
        }
        return result;
    }

    public static void main(String[] args) {
        int[][] a = {
                {1, 2, 3},
                {4, 5, 6}};
        int[][] b = {
                {7 , 8},
                {9 , 10},
                {11, 12} };

        int[][] result = multiply(a, b);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
}

