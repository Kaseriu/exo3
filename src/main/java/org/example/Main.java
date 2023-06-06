package org.example;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator("src/main/resources/numbers.txt", "*");
        calculator.calculate();
    }
}