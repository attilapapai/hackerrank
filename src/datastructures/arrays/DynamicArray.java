package datastructures.arrays;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * https://www.hackerrank.com/challenges/dynamic-array/problem
 */
public class DynamicArray {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] firstLine = in.nextLine().split(" ");
        int numberOfSequences = Integer.parseInt(firstLine[0]);
        int numberOfQueries = Integer.parseInt(firstLine[1]);
        int lastAnswer = 0;
        List<List<Integer>> sequences = createSequences(numberOfSequences);
        for (int i = 0; i < numberOfQueries; i++) {
            String[] input = in.nextLine().split(" ");
            int queryType = Integer.parseInt(input[0]);
            int x = Integer.parseInt(input[1]);
            int y = Integer.parseInt(input[2]);
            if (queryType == 1) {
                queryOne(sequences, x, y, lastAnswer);
            } else {
                lastAnswer = queryTwo(sequences, x, y, lastAnswer);
                System.out.println(lastAnswer);
            }
        }
    }

    private static List<List<Integer>> createSequences(int numberOfSequences) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = 0; i < numberOfSequences; i++) {
            ret.add(new ArrayList<>());
        }
        return ret;
    }

    private static int queryTwo(List<List<Integer>> sequences, int x, int y, int lastAnswer) {
        int index = (x ^ lastAnswer) % sequences.size();
        List<Integer> sequence = sequences.get(index);
        int elementPos = y % sequence.size();
        return sequence.get(elementPos);
    }

    private static void queryOne(List<List<Integer>> sequences, int x, int y, int lastAnswer) {
        int index = (x ^ lastAnswer) % sequences.size();
        sequences.get(index).add(y);
    }
}
