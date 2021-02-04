package fundamentals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //      System.out.println("Hello World");


    /*  static vs non-static fields and methods
        TasksExercises tasksExercices1 = new TasksExercises();
        TasksExercises tasksExercices2 = new TasksExercises();
        System.out.println("x = " + tasksExercices1.x);
        System.out.println("y = " + tasksExercices1.y);
        System.out.println("y = " + tasksExercices2.y);
        tasksExercices1.x = 22;
        tasksExercices2.y = 3;
        System.out.println("x1 = " + tasksExercices1.x);
        System.out.println("x2 = " + tasksExercices2.x);
        System.out.println("y1 = " + tasksExercices1.y);
        System.out.println("y2 = " + tasksExercices2.y);

        //Task1
        tasksExercices1.perimeters();


        Tema tema = new Tema();
        tema.bodyMassIndex();                              */


        //   TasksExercises.printAllPrimeNumbers();
        //    Tema.fizzBuzz();
        // TasksExercises.stutters();
        //  TasksExercises.testObjects();


        //   TasksExercises.printAllPrimeNumbers();
        //  Tema.fizzBuzz();
        //      Tema.longestWord();


        StringExercises stringExercises = new StringExercises();
        System.out.println("----------------");
        stringExercises.givenIndex();
        System.out.println("----------------");
        stringExercises.givenStringContains();
        System.out.println("----------------");
        stringExercises.replaceSpecifiedCharacter();
        System.out.println("----------------");
        stringExercises.uppercaseFirstLetter();
        System.out.println("----------------");
        stringExercises.ignoringCase();




        ArrayExercises arrayExercises = new ArrayExercises();
        System.out.println("----------------");
        arrayExercises.findMaxProduct();
        System.out.println("----------------");
        arrayExercises.removeElement();
        System.out.println("----------------");
        arrayExercises.secondMaxNumber();
        System.out.println("----------------");
        arrayExercises.duplicateValues();


    }
}


