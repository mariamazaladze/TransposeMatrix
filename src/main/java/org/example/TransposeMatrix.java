package org.example;

import java.util.Arrays;

/**
 * Revers , columne transver to row
 * Description
 * Please, proceed to TransposeMatrix class an implement its method multiply.
 * It takes a rectangular integer array (matrix) as a parameter and returns it transposed.
 * Consider an integer matrix represented as a rectangular array. The task is to transpose a given matrix over its main diagonal.
 * The transposition of a matrix over its main diagonal is simply a flipped version of the original matrix.
 */
public class TransposeMatrix {

    public static void main(String[] args) {
        int[][] matrix = {
                {0, 1, 2},
                {3, 4, 5},
                {6, 7, 8}};

        int[][] result = transpose(matrix);
        System.out.println(Arrays.deepToString(result).replace("],", "]\n"));
    }
    public static int[][] transpose(int[][] matrix) {
        int row = matrix.length;
        int columns = matrix[0].length;

        int[][] transposedMatrix = new int[columns][row];

        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < row; j++) {
                transposedMatrix[i][j] = matrix[j][i];
            }
        }
        return transposedMatrix;
    }



}
