package org.example;

public class Main {
    public static void main(String[] args) {
//        Calculator calculator1 = new Calculator("src/main/resources/numbers.txt", "*");
//        calculator1.calculate();

        Calculator calculator2 = new Calculator("src/main/resources/numbers.txt", "+", "-log");
        calculator2.calculate();
    }
}