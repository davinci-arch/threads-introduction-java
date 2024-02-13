package org.example;

import java.util.List;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.concurrent.TimeUnit;

public class TaskScheduler implements Runnable{

    private long executionTask = 1;
    private boolean isRunning = true;


    public synchronized boolean isRunning() {
        return isRunning;
    }


    @Override
    public void run() {

        try {
            TimeUnit.SECONDS.sleep(executionTask);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        isRunning = false;
    }
}
