package datastructures.arrays;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/array-left-rotation/problem
 */
public class LeftRotation {

    private static int[] leftRotation(int[] a, int d) {
        int[] copy = new int[a.length];
        System.arraycopy(a, 0, copy, 0, a.length);
        // optimization: if d > a.length then d = d%a
        for (int i = 0; i < d; i++) {
            rotateLeftInPlace(copy);
        }
        return copy;
    }

    private static void rotateLeftInPlace(int[] a) {
        int firstVal = a[0];
        for (int i = 1; i < a.length; i++) {
            a[i - 1] = a[i];
        }
        a[a.length - 1] = firstVal;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int d = in.nextInt();
        int[] a = new int[n];
        for(int a_i = 0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }
        int[] result = leftRotation(a, d);
        for (int i = 0; i < result.length; i++) {
            System.out.print(result[i] + (i != result.length - 1 ? " " : ""));
        }
        System.out.println("");


        in.close();
    }
}
