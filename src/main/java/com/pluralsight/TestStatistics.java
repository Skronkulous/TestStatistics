package com.pluralsight;
import java.util.*;
import java.math.*;

public class TestStatistics {
    public static void main(String[] args) {
        int[] testScores = new int[10];
        Scanner kbScanner = new Scanner(System.in);
        int average = 0, highScore = 0, lowScore = 0;

        System.out.print("Please enter your 10 test scores: \n1: ");
        testScores[0] = kbScanner.nextInt();
        System.out.print("2: ");
        testScores[1] = kbScanner.nextInt();
        System.out.print("3: ");
        testScores[2] = kbScanner.nextInt();
        System.out.print("4: ");
        testScores[3] = kbScanner.nextInt();
        System.out.print("5: ");
        testScores[4] = kbScanner.nextInt();
        System.out.print("6: ");
        testScores[5] = kbScanner.nextInt();
        System.out.print("7: ");
        testScores[6] = kbScanner.nextInt();
        System.out.print("8: ");
        testScores[7] = kbScanner.nextInt();
        System.out.print("9: ");
        testScores[8] = kbScanner.nextInt();
        System.out.print("10: ");
        testScores[9] = kbScanner.nextInt();

        Arrays.sort(testScores);

        for(int j = 0; j  < testScores.length; j++)
            average += testScores[j];
        average /= testScores.length;
        System.out.println("Average Score: " + average);
        System.out.println("Highest Score: " + testScores[9]);
        System.out.println("Lowest Score: " + testScores[0]);
        System.out.println("Median Score: " + (testScores[4] + testScores[5])/2);
    }
}
