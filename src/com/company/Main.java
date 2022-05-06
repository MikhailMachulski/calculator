package com.company;

public class Main {

    public static void main(String[] args) {

        Calculator calc = Calculator.instance.get();

        int a = calc.plus.apply(1, 2);
        int b = calc.minus.apply(1, 1); //результатом вычисления будет 0
        int c = calc.divide.apply(a, b); // при проведении операции выбрасывается ArithmeticException (деление на 0)

        calc.println.accept(c);
    }
}
