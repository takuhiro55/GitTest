package com.test;

public class Cashier implements Calc_Interface{

    public double value1;
    public double value2;
    public double sum;

    public Cashier(double value1, double value2){
        this.value1 = value1;
        this.value2 = value2;
        sum = value1 + value2;
    }

    @Override
    public double sum() {
        sum = sum + value1;
        return sum;
    }
}
