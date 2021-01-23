package fundamentals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World");


        //static vs non-static fields and methods
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

    }
}
