package org.example.domain;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Calculator {
    private final String operation;
    private String log;
    private final String[] lines;
    private final LocalDateTime time = LocalDateTime.now();
    private final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("HHmmss");

    public Calculator(String filePath, String operation) {
        this.operation = operation;
        Parser parser = new Parser(filePath);
        this.lines = parser.parseFile();
    }

    public Calculator(String filePath, String operation, String log) {
        this.operation = operation;
        Parser parser = new Parser(filePath);
        this.lines = parser.parseFile();
        if (Objects.equals(log, "-log")) {
            this.log = log;
        }
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
        if (this.log != null) {
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] started");
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] applying operation addition");
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] parsed value = " + this.lines[0]);
        }

        int sum = Integer.parseInt(this.lines[0]);
        System.out.println(this.lines[0]);

        if (this.log != null) {
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] accumulation : "
                    + sum + " on line 1");
        }

        for (int i = 1; i < this.lines.length; i++) {
            if (this.log != null) {
                System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] parsed value = " + this.lines[i]);
            }

            sum += Integer.parseInt(this.lines[i]);
            System.out.print("+" + this.lines[i]);
            System.out.println(" (= " + sum + ")");

            if (this.log != null) {
                System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] accumulation : "
                        + sum + " on line " + (i + 1));
            }
        }

        System.out.println("-------");
        System.out.println("total = " + sum + " (addition)");

        if (this.log != null) {
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] end of program");
        }
    }

    public void soustraction() {
        if (this.log != null) {
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] started");
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] applying operation soustraction");
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] parsed value = " + this.lines[0]);
        }

        int sum = Integer.parseInt(this.lines[0]);
        System.out.println(this.lines[0]);

        if (this.log != null) {
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] accumulation : "
                    + sum + " on line 1");
        }

        for (int i = 1; i < this.lines.length; i++) {
            if (this.log != null) {
                System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] parsed value = " + this.lines[i]);
            }

            sum -= Integer.parseInt(this.lines[i]);
            System.out.print("+" + this.lines[i]);
            System.out.println(" (= " + sum + ")");

            if (this.log != null) {
                System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] accumulation : "
                        + sum + " on line " + (i + 1));
            }
        }

        System.out.println("-------");
        System.out.println("total = " + sum + " (soustraction)");

        if (this.log != null) {
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] end of program");
        }
    }

    public void multiplication() {
        if (this.log != null) {
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] started");
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] applying operation multiplication");
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] parsed value = " + this.lines[0]);
        }

        int sum = Integer.parseInt(this.lines[0]);
        System.out.println(this.lines[0]);

        if (this.log != null) {
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] accumulation : "
                    + sum + " on line 1");
        }

        for (int i = 1; i < this.lines.length; i++) {
            if (this.log != null) {
                System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] parsed value = " + this.lines[i]);
            }

            sum *= Integer.parseInt(this.lines[i]);
            System.out.print("+" + this.lines[i]);
            System.out.println(" (= " + sum + ")");

            if (this.log != null) {
                System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] accumulation : "
                        + sum + " on line " + (i + 1));
            }
        }

        System.out.println("-------");
        System.out.println("total = " + sum + " (addition)");

        if (this.log != null) {
            System.out.println("[" + this.time.format(this.formatter) + "]" + "[log] end of program");
        }
    }
}
