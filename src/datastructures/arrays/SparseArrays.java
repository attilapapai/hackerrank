package datastructures.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/sparse-arrays/problem
 */
public class SparseArrays {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int numberOfStrings = in.nextInt();
        in.nextLine();
        List<String> strings = new ArrayList<>();
        for (int i = 0; i < numberOfStrings; i++) {
            strings.add(in.nextLine());
        }
        int numberOfQueries = in.nextInt();
        in.nextLine();
        for (int i = 0; i < numberOfQueries; i++) {
            String query = in.nextLine();
            int occurrenceCount = 0;
            for (String s : strings) {
                if (s.equals(query)) {
                    occurrenceCount++;
                }
            }
            System.out.println(occurrenceCount);
        }
    }
}
