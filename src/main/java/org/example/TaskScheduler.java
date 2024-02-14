package org.example;

import java.util.concurrent.TimeUnit;

public class TaskScheduler implements Runnable{

    private long executionTaskSeconds = 1;
    private volatile boolean isRunning = true;


    public boolean isRunning() {
        return isRunning;
    }


    @Override
    public void run() {

        try {
            TimeUnit.SECONDS.sleep(executionTaskSeconds);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        isRunning = false;
    }
}
