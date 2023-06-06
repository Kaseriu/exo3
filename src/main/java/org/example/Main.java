package org.example;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        Parser parser = new Parser("src/main/java/org/example/numbers.txt");
        String[] lines = parser.parseFile();
        Calculator calculator = new Calculator(lines);
        calculator.add();
    }
}