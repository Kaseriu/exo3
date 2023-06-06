package org.example;

public class Calculator {
    private final String[] lines;

    public Calculator(String[] lines) {
        this.lines = lines;
    }

    public void add() {
        int sum = 0;

        for (int i = 0; i < this.lines.length; i++) {
            sum += Integer.parseInt(this.lines[i]);
            if (i == 0) {
                System.out.println(this.lines[i]);
            } else {
                System.out.print("+" + this.lines[i]);
                System.out.println(" (= " + sum + ")");
            }
        }

        System.out.println("-------");
        System.out.println("total = " + sum + " (addition)");
    }
}
