package fundamentals;



import java.util.Scanner;

public class Tema {


  /*  Write an application calculating BMI (Body Mass Index) and checking if itЀs optimal or not.
    Your application should read two variables: weight (in kilograms, type float) and height
(in centimeters, type int). BMI should be calculated given following formula:
    The optimal BMI range is from 18.5 to 24.9, smaller or larger values are non-optimal
    values. Your program should write "BMI optimal" or "BMI not optimal", according to the
    assumptions above.   */

    public static void bodyMassIndex() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Input weight in Kg : ");
        float weight = scanner.nextFloat();

        System.out.println(" Input height in meters : ");
        float height = scanner.nextFloat();

        float BMI = weight / ((float) height / 100 * (float) height / 100);
        if ((BMI > 18.5) && (BMI < 24.9)) {
            System.out.println(" Body mass index is " + BMI + " , so is optimal ");
        } else {
            System.out.println(" Body mass index is " + BMI + " ,is not optimal ");
        }
    }

}

