package com.hackerrank.problemsolving.easy;

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
}
