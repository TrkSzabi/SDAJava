package fundamentals;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ArrayExercises {

    //       Write a Java program to find maximum product of two integers in a given array of integers.
    //      Example: nums = { 2, 3, 5, 7, -7, 5, 8, -5 } => Pair is (7, 8), Maximum Product: 56

    public static void findMaxProduct() {
        int maxProduct = 0;
        int[] myArray = {2, 3, 5, 7, -7, 5, 8, -5};
        for (int i = 0; i < (myArray.length - 1); i++) {
            for (int j = i + 1; j < myArray.length; j++) {
                if (maxProduct < myArray[i] * myArray[j]) {
                    maxProduct = myArray[i] * myArray[j];
                }
            }
        }
        System.out.println("Max product is : " + maxProduct);
    }


    //  Write a Java program to remove a specific element from an array.

    public static void removeElement() {
        int[] myArray1 = {2, 3, 5, 7, -7, 5, 8, -5};
        System.out.println("Original array : " + Arrays.toString(myArray1));

        int removeIndex = 3;
        for (int i = removeIndex; i < myArray1.length - 1; i++) {
            myArray1[i] = myArray1[i + 1];
        }
        System.out.println("Array after removed element : " + Arrays.toString(myArray1));

    }

    //  Write a Java program to find the max number (harder: the second max number) in an array of integers.

    public static void secondMaxNumber() {
        int[] arrayNumbers = {2, 3, 5, 7, -7, 5, 8, -5, 111, 7, 80};

        int maxNr = arrayNumbers[0];
        int secMax = arrayNumbers[0];

        for (int i = 1; i < arrayNumbers.length; i++) {
            if (arrayNumbers[i] > maxNr) {
                secMax = maxNr;
                maxNr = arrayNumbers[i];
            } else if (arrayNumbers[i] > secMax) {
                secMax = arrayNumbers[i];
            }
        }
        System.out.println("Max number is : " + maxNr);
        System.out.println("Second max number is : " + secMax);
    }

    //  Write a Java program to find the duplicate values of an array of string values

    public static void duplicateValues() {
        String[] stringCars = {"BMW", "AUDI", "OPEL", "FORD", "OPEL", "MERCEDES"};

        for (int i = 0; i < stringCars.length; i++) {
            for (int j = i + 1; j < stringCars.length; j++) {
                if (stringCars[i].equals((stringCars[j])) && (i != j)) {

                    System.out.println(" The duplicate value is : " + stringCars[j]);

                }
            }
        }
    }
}


