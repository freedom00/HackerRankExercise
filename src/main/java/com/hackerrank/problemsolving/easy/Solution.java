package com.hackerrank.problemsolving.easy;

import java.util.Arrays;
import java.util.List;

public class Solution {
    //1. Solve Me First
    public static int solveMeFirst(int a, int b) {
        return a + b;
    }

    //2. Simple Array Sum
    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream().mapToInt(i -> i).sum();
    }

    //3. Compare the Triplets
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        int sumA = 0;
        int sumB = 0;
        for (int i = 0; i < Math.min(a.size(), b.size()); i++) {
            if (a.get(i) < b.get(i)) {
                sumB++;
            } else if (a.get(i) > b.get(i)) {
                sumA++;
            }
        }
        return Arrays.asList(sumA, sumB);
    }

    //4. A Very Big Sum
    public static long aVeryBigSum(List<Long> ar) {
        return ar.stream().mapToLong(i -> i).sum();
    }
}
