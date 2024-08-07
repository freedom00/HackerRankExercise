package com.hackerrank.problemsolving.easy;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    void tearDown() {
        System.setOut(System.out);
    }

    @Test
    @DisplayName("Solve Me First")
    public void solveMeFirst() {
        assertEquals(4, Solution.solveMeFirst(2, 2));
    }

    @Test
    @DisplayName("Simple Array Sum")
    void simpleArraySum() {
        assertEquals(31, Solution.simpleArraySum(Arrays.asList(1, 2, 3, 4, 10, 11)));
    }

    @Test
    @DisplayName("Compare the Triplets")
    void compareTriplets() {
        List<Integer> a = Arrays.asList(5, 6, 7);
        List<Integer> b = Arrays.asList(3, 6, 10);
        assertEquals(Arrays.asList(1, 1), Solution.compareTriplets(a, b));
    }

    @Test
    @DisplayName("A Very Big Sum")
    void aVeryBigSum() {
        assertEquals(5000000015L, Solution.aVeryBigSum(Arrays.asList(1000000001L, 1000000002L, 1000000003L, 1000000004L, 1000000005L)));
    }

    @Test
    @DisplayName("Diagonal Difference")
    void diagonalDifference() {
        assertEquals(2, Solution.diagonalDifference(Arrays.asList(Arrays.asList(1, 2, 3), Arrays.asList(4, 5, 6), Arrays.asList(9, 8, 9))));
    }

    @Test
    @DisplayName("Plus Minus")
    void plusMinus() {
        assertEquals(Arrays.asList("0.500000", "0.333333", "0.166667"), Solution.plusMinus(Arrays.asList(-4, 3, -9, 0, 4, 1)));
    }

    @Test
    @DisplayName("Staircase")
    void staircase() {
        String expectedOutput = "     #\r\n    ##\r\n   ###\r\n  ####\r\n #####\r\n######\r\n";
        Solution.staircase(6);
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Mini-Max Sum")
    void miniMaxSum() {
        String expectedOutput = "10 14\r\n";
        Solution.miniMaxSum(Arrays.asList(1, 2, 3, 4, 5));
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Birthday Cake Candles")
    void birthdayCakeCandles() {
        assertEquals(2, Solution.birthdayCakeCandles(Arrays.asList(3, 2, 1, 3)));
    }

    @Test
    @DisplayName("Time Conversion")
    void timeConversion() {
        assertEquals("19:05:45", Solution.timeConversion("07:05:45PM"));
    }

    @Test
    @DisplayName("Grading Students")
    void gradingStudents() {
        assertEquals(Arrays.asList(75, 67, 40, 33), Solution.gradingStudents(Arrays.asList(73, 67, 38, 33)));
    }

    @Test
    @DisplayName("Apple and Orange")
    void countApplesAndOranges() {
        String expectedOutput = "1\r\n2\r\n";
        Solution.countApplesAndOranges(7, 10, 4, 12, Arrays.asList(2, 3, -4), Arrays.asList(3, -2, -4));
        assertEquals(expectedOutput, outContent.toString());
    }

    @Test
    @DisplayName("Number Line Jumps")
    void kangaroo() {
        assertEquals("YES", Solution.kangaroo(0, 3, 4, 2));
    }

    @Test
    @DisplayName("Between Two Sets")
    void getTotalX() {
        assertEquals(3, Solution.getTotalX(Arrays.asList(2, 4), Arrays.asList(16, 32, 96)));
    }
}
