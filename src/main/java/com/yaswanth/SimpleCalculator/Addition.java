package com.yaswanth.SimpleCalculator;

public class Addition extends SimpleCalculator{
    public Addition(double num1, double num2){
        super(num1, num2);
    }

    public double calculate(){
        return getNum1() + getNum2();
    }
}
