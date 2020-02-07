package com.company;

public class Complex {
    double first = 0;
    double second = 0;

    public Complex(double a) {
        first = a;
        second = 0;
    }

    public Complex(double a, double b) {
        first = a;
        second = b;
    }

    public double abs() {
        double y = Math.pow(first, 2) + Math.pow(second, 2);
        double x = Math.pow(y, 0.5);
        return x;
    }

    public Complex add(Complex z2) {
        double real = this.first + z2.first;
        double imag = this.second + z2.second;
        Complex water = new Complex(real, imag);
        return water;
    }

    public String toString() {
        String c = first + " + " + second + "i";
        return c;
    }
    public Complex multiply(Complex z2){
        double real = this.first*z2.first - this.second*z2.second;
        double imag = this.first*z2.second + this.second*z2.first;
        Complex water = new Complex(real, imag);
        return water;
    }
    public Complex multiply(double z3){
        double real = this.first*z3;
        double imag = this.second*z3;
        Complex water = new Complex(real, imag);
        return water;
    }
}