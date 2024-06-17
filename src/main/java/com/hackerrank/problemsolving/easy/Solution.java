package com.hackerrank.problemsolving.easy;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Collections;
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

    //5. Diagonal Difference
    public static int diagonalDifference(List<List<Integer>> arr) {
        int sum1 = 0;
        int sum2 = 0;
        for (int i = 0; i < arr.size(); i++) {
            sum1 += arr.get(i).get(i);
            sum2 += arr.get(i).get(arr.get(i).size() - 1 - i);
        }
        return Math.abs(sum1 - sum2);
    }

    //6. Plus Minus
    public static List<String> plusMinus(List<Integer> ar) {
        long positive = ar.stream().filter(i -> i > 0).count();
        long negative = ar.stream().filter(i -> i < 0).count();
        long neutral = ar.stream().filter(i -> i == 0).count();
//        DecimalFormat df = new DecimalFormat("0.000000");
//        return Arrays.asList(df.format((double) positive / ar.size()), df.format((double) negative / ar.size()), df.format((double) neutral / ar.size()));
        return Arrays.asList(String.format("%.6f", (double) positive / ar.size()), String.format("%.6f", (double) negative / ar.size()), String.format("%.6f", (double) neutral / ar.size()));
    }

    //7. Staircase
    public static void staircase(int n) {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1 - i; j++) {
                System.out.print(" ");
            }
            for (int j = n - 1 - i; j < n; j++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    //8. Mini-Max Sum
    public static void miniMaxSum(List<Integer> arr) {
        int max = Collections.max(arr);
        int min = Collections.min(arr);
        long sum = arr.stream().mapToLong(i -> i).sum();
        System.out.println((sum - max) + " " + (sum - min));
    }

    //9. Birthday Cake Candles
    public static int birthdayCakeCandles(List<Integer> candles) {
        return Collections.frequency(candles, Collections.max(candles));
    }

    //10. Time Conversion
    public static String timeConversion(String s) {
        SimpleDateFormat parseFormat = new SimpleDateFormat("hh:mm:ssa");
        SimpleDateFormat displayFormat = new SimpleDateFormat("HH:mm:ss");
        try {
            return displayFormat.format(parseFormat.parse(s));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }

    //11. Grading Students
    public static List<Integer> gradingStudents(List<Integer> grades) {
        for (int i = 0; i < grades.size(); i++) {
            if (grades.get(i) < 38) {
                continue;
            }
            int times = 0;
            do {
                times++;
            } while ((grades.get(i) + times) % 5 != 0);
            if (times < 3) {
                grades.set(i, grades.get(i) + times);
            }
        }
        return grades;
    }

    //12. Apple and Orange
    public static void countApplesAndOranges(int s, int t, int a, int b, List<Integer> apples, List<Integer> oranges) {
        System.out.println(apples.stream().filter(i -> a + i >= s && a + i <= t).count());
        System.out.println(oranges.stream().filter(i -> b + i >= s && b + i <= t).count());
    }
}
