package com.hackerrank.problemsolving.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void solveMeFirst() {
        assertEquals(4, Solution.solveMeFirst(2, 2));
    }

    @Test
    void simpleArraySum() {
        assertEquals(31, Solution.simpleArraySum(Arrays.asList(1, 2, 3, 4, 10, 11)));
    }

    @Test
    void compareTriplets() {
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);
        assertEquals(Arrays.asList(1, 1), Solution.compareTriplets(a, b));
    }
}
