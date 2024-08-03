package app;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int [] array = {15, 44, -15, -34,  5, 9, 22, 7, -77, -13,
                99, 1, 11, 55, 44, -11, -64, 66, 88, 33};

        System.out.println("Array: " + Arrays.toString(array));

        // negative
        int negativeNum = 0;
        for (int num : array) {
            if (num < 0) {
                negativeNum += num;
            }
        }
        System.out.println("Sum of negative numbers: " + negativeNum);

        //even and odd
        int evenCount = 0;
        int oddCount = 0;
        for (int num : array) {
            if (num %2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of odd numbers " + oddCount);

        // max and min
        int maxNum = array[0];
        int minNum = array[0];
        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 1; i < array.length; i++) {
            if ( array[i] > maxNum) {
                maxNum = array[i];
                maxIndex = i;
            } if (array[i] < minNum) {
                minNum = array[i];
                minIndex = i;
            }
        }
        System.out.println("The greatest number: " + maxNum + " (with index " + maxIndex + ")");
        System.out.println("The largest number: " + minNum + " (with index " + minIndex + ")");

        //the arithmetic mean, after the first negative number
        int firstNegativeIndex = -1;
        for ( int i = 0; i < array.length; i++) {
            if (array[i] < 0 ) {
                firstNegativeIndex = i;
                break;
            }
        }
        if (firstNegativeIndex != -1) {
            int sumAfrerFirstNegativeIndex =0;
            int countAfterfirstNegativeIndex = 0;
            for (int i = firstNegativeIndex + 1; i < array.length; i++) {
                sumAfrerFirstNegativeIndex += array[i];
                countAfterfirstNegativeIndex++;
            }
            double average = (double) sumAfrerFirstNegativeIndex  / countAfterfirstNegativeIndex;
            System.out.printf("The arithmetic mean, after the first negative number: %.2f", average);
        }
    }
}
