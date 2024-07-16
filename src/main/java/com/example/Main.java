package com.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            System.out.print("\n");
            System.out.print(
                    "\n Введите выражение (Первое число, операция(+, -, *, /), второе число. Между числами и знаком пробел): ");
            String expression = in.nextLine();
            Calculator.calc(expression);
        }

    }
}