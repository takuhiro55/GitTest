package com.test;

public class Main {

    public static void main(String[] args) {
        Calc_Interface calc = new Cashier(3.5, 5.5);
        System.out.println("Hello World.");
        System.out.println(calc.sum());
        System.out.println(calc.sum());
        System.out.println(calc.sum());
    }

}
