package org.example;

public class Task {

    private int h;
    private int result;
    private int amountOfIterations;

    public Task(int h) {
        this.h = h;
    }

    public void calculate() {
        // TODO: logic for arithmetics progression
        result += h;
        amountOfIterations++;
    }

    public String getResult() {
        StringBuilder sb = new StringBuilder();

        sb.append("\nTask has been completed.")
                .append("\nAmount of iterations: ").append(amountOfIterations)
                .append("\nSum of all members of regression: ").append(result)
                .append("\nStep: ").append(h);

        return sb.toString();
    }
}
