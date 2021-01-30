package fundamentals;

import java.util.Scanner;

public class TasksExercises {
    public static final float pi = (float) Math.PI;


    int x = 10;
    static int y = 1;
    //Write an application that will read diameter of a circle (variable of type float) and
    //calculate perimeter of given circle.
    //Firstly, assume π = 3.14. Later, use value of π from built-in Math class

    public static void perimeters() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Diametru este: ");
        float diametru = scanner.nextFloat();
        System.out.println("Perimetrul este " + diametru * pi);
    }



   /* Write an application that takes a positive number from the user (type int) and prints all
      prime numbers greater than 1 and less than the given number.     */

    public static void printAllPrimeNumbers() {
        System.out.println(" Give me a number ");
        Scanner scanner = new Scanner(System.in);
        int newNumber = scanner.nextInt();
        if (newNumber <= 1) {
            System.out.println(" The number is not greather than 1 ");
            return;
        } else {
            for (int i = 2; i < newNumber; i++) {
                if (isPrime1(i)) {
                    System.out.println(i);
                }
            }
        }
    }
    private static boolean isPrime1(int nr) {
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static boolean isPrime3(int nr) {
        if (nr == 2) {
            return true;
        }
        if (nr == 0 || nr == 1 || nr % 2 == 0) {
            return false;
        }
        for (int i = 3; i * i <= nr; i += 2) {
            if (nr % i == 0) {
                return false;
            }
        }
        return true;
    }
    private static boolean isPrime2(int nr) {
        boolean isPrimeNo = true;
        for (int i = 2; i <= nr / 2; i++) {
            if (nr % i == 0) {
                isPrimeNo = false;
                break;
            }
        }
        return true;
    }
}


