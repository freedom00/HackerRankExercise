package com.hackerrank.problemsolving.easy;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

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
}
