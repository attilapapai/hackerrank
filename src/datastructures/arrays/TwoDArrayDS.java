package datastructures.arrays;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/2d-array/problem
 *
 */
public class TwoDArrayDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[][] matrix = parseMatrixFromInput(in);
        int max = getMaxHourGlassValue(matrix);
        System.out.println(max);
    }

    private static int getMaxHourGlassValue(int[][] matrix) {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                int sum = getHourGlassValueAtPosition(matrix, i, j);
                if (sum > max) {
                    max = sum;
                }
            }
        }
        return max;
    }

    private static int getHourGlassValueAtPosition(int[][] matrix, int i, int j) {
        int sum = 0;
        sum += matrix[i][j];
        sum += matrix[i][j + 1];
        sum += matrix[i][j + 2];
        sum += matrix[i + 1][j + 1];
        sum += matrix[i + 2][j];
        sum += matrix[i + 2][j + 1];
        sum += matrix[i + 2][j + 2];
        return sum;
    }

    private static int[][] parseMatrixFromInput(Scanner in) {
        int[][] matrix = new int[6][6];
        for (int i = 0; i < 6; i++) {
            String[] line = in.nextLine().split(" ");
            for (int j = 0; j < 6; j++) {
                matrix[i][j] = Integer.valueOf(line[j]);
            }
        }
        return matrix;
    }
}
