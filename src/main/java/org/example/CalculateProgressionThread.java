package org.example;

import java.util.concurrent.ConcurrentLinkedQueue;

public class CalculateProgressionThread extends Thread {

    private long id;
    private TaskScheduler taskScheduler;
    private Task currentTask;
    public CalculateProgressionThread(long id, Task task, TaskScheduler taskScheduler) {
        this.id = id;
        this.currentTask = task;
        this.taskScheduler = taskScheduler;
    }

    @Override
    public void run() {
        while (true) {
            if (taskScheduler.isRunning()) {

                currentTask.calculate();
            } else {
                break;
            }
        }
        printResult();
    }
    public void printResult() {
        System.out.println(new StringBuilder().append("Current thread id: ").append(id)
                .append(currentTask.getResult())
                .append("\n")
                .append("=".repeat(50)));

    }
}
