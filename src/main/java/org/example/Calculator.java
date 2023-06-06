package org.example;

public class Calculator {
    private final String operation;
    private final String[] lines;

    public Calculator(String filePath, String operation) {
        this.operation = operation;
        Parser parser = new Parser(filePath);
        this.lines = parser.parseFile();
    }

    public void calculate() {
        switch (this.operation) {
            case "+" -> this.addition();
            case "-" -> this.soustraction();
            case "*" -> this.multiplication();
            default -> System.out.println("Operation not supported");
        }
    }

    public void addition() {
        int sum = Integer.parseInt(this.lines[0]);
        System.out.println(this.lines[0]);

        for (int i = 1; i < this.lines.length; i++) {
            sum += Integer.parseInt(this.lines[i]);
            System.out.print("+" + this.lines[i]);
            System.out.println(" (= " + sum + ")");
        }

        System.out.println("-------");
        System.out.println("total = " + sum + " (addition)");
    }

    public void soustraction() {
        int sum = Integer.parseInt(this.lines[0]);
        System.out.println(this.lines[0]);

        for (int i = 1; i < this.lines.length; i++) {
            sum -= Integer.parseInt(this.lines[i]);
            System.out.print("-" + this.lines[i]);
            System.out.println(" (= " + sum + ")");
        }

        System.out.println("-------");
        System.out.println("total = " + sum + " (soustraction)");
    }

    public void multiplication() {
        int sum = Integer.parseInt(this.lines[0]);
        System.out.println(this.lines[0]);

        for (int i = 1; i < this.lines.length; i++) {
            sum *= Integer.parseInt(this.lines[i]);
            System.out.print("*" + this.lines[i]);
            System.out.println(" (= " + sum + ")");
        }

        System.out.println("-------");
        System.out.println("total = " + sum + " (multiplication)");
    }
}
