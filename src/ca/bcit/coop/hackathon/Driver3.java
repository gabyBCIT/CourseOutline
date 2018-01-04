package ca.bcit.coop.hackathon;

import java.io.File;
import java.io.FileNotFoundException;
import java.time.Month;
import java.util.Collections;
import java.util.Scanner;

public class Driver3 {

    static int month = 0;

    static int day = 0;

    public static void parseText() throws FileNotFoundException {

        Scanner scan = new Scanner(new File("output.txt"));

        while (scan.hasNext()) {
            month = Month.valueOf(scan.next().toUpperCase().trim()).getValue();

            day = scan.nextInt();

            CourseName course = CourseName.COMP2510;

            if (scan.next().trim().equals("COMP2510")) {
                course = CourseName.COMP2526;
            }

            scan.nextLine();
            String taskHand = scan.nextLine().trim();

            Task2 task = new Task2(taskHand, new Date(month, day), course);

        }
        
        Collections.sort(Task2.array);
        for (Task2 thisTask : Task2.array) {
            System.out.println(thisTask);
        }

        scan.close();

    }

    public static void main(String[] args) throws FileNotFoundException {

        parseText();

    }

}
