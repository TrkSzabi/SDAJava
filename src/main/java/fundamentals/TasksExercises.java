package fundamentals;

import java.sql.SQLOutput;
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

        return true;
    }

 /*  Write an application that "stutters", that is, reads the user's text (type String), and prints
    the given text, in which each word is printed twice.
    For example, for the input: "This is my test" the application should print "This This is is
    my my test test".     */

   public static void stutters() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Type your word: ");

        String text = scan.nextLine();
        String[] words = text.split(" ");

        System.out.print("Stutter: ");

        for (int i = 0; i < words.length - 1; i++) {
            System.out.print(words[i] + " " + words[i] + " ");
        }
        System.out.println(words[words.length - 1] + " " + words[words.length - 1]);
    }


    public static void testStrings() {
        String s1 = "abc", s2 = "abc", s3 = new String("abc");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s1.equals(s3));
    }
    public static void testObjects() {
        Dog dog1 = new Dog("Azorel");
//        dog1.setName("Azorel");

        Dog dog2 = new Dog("Azorel");
//        dog2.setName("Azorel");

        System.out.println(dog1 == dog2);
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.getName().equals(dog2.getName()));

        return ;

    }

}


