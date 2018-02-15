package datastructures.arrays;

import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/arrays-ds/problem
 */
public class ArrayDS {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int size = in.nextInt();
        in.nextLine();
        String[] elements = in.nextLine().split(" ");
        System.out.print(elements[size - 1]);
        for (int i = size - 2; i >= 0; i--) {
            System.out.print(" " + elements[i]);
        }
    }
}
