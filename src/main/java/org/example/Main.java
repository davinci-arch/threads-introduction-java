package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    private static Scanner in = new Scanner(System.in);
    private static int amountOfThreads;
    private static List<Task> tasks = new ArrayList<>();
    public static void main(String[] args) {

        System.out.print("Write amount of threads: ");
        amountOfThreads = in.nextInt();

        for (int i = 0; i < amountOfThreads; i++) {
            System.out.print("Write step for task regression: ");
            tasks.add(new Task(in.nextInt()));
        }

        TaskScheduler scheduler = new TaskScheduler();

        for (int i = 0; i < tasks.size(); i++) {
            new CalculateProgressionThread(i+1, tasks.get(i),scheduler).start();
        }

        Thread t = new Thread(scheduler);
        t.start();


    }
}