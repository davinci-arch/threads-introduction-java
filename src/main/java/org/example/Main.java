package org.example;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<Task> tasks = new ArrayList<>(List.of(
                new Task(2),
                new Task(10),
                new Task(1),
                new Task(34)
        ));

        TaskScheduler scheduler = new TaskScheduler();

        for (int i = 0; i < tasks.size(); i++) {
            new CalculateProgressionThread(i+1, tasks.get(i),scheduler).start();
        }

        Thread t = new Thread(scheduler);
        t.start();


    }
}