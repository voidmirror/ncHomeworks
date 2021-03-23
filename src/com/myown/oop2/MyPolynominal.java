package com.myown.oop2;

import java.util.ArrayList;
import java.util.Arrays;

public class MyPolynominal {
    private double[] coeffs;

    public double[] getCoeffs() {
        return coeffs;
    }

    public MyPolynominal(double... coeffs) {
        this.coeffs = coeffs.clone();
    }

    public int getDegree() {
        return coeffs.length - 1;
    }

    public double evaluate() {
        double res = 0;
        for (int i = 0; i < coeffs.length; i++) {
            res += Math.pow(coeffs[i], i);
        }
        return res;
    }

    public MyPolynominal add(MyPolynominal right) throws CloneNotSupportedException {
        MyPolynominal res;
        if (getCoeffs().length >= right.getCoeffs().length) {
            res = (MyPolynominal) this.clone();
            for (int i = 0; i < right.getCoeffs().length; i++) {
                res.getCoeffs()[i] += right.getCoeffs()[i];
            }
        } else {
            res = (MyPolynominal) right.clone();
            for (int i = 0; i < getCoeffs().length; i++) {
                res.getCoeffs()[i] += getCoeffs()[i];
            }
        }
        return res;
    }

    public MyPolynominal multiply(MyPolynominal right){
        double[] res = new double[coeffs.length * right.getCoeffs().length];
        ArrayList<Double> first = new ArrayList<>();
        ArrayList<Double> second = new ArrayList<>();
        for (double d : coeffs) {
            first.add(d);
        }
        for (double d : right.getCoeffs()) {
            first.add(d);
        }

        for (int i = 0; i < coeffs.length; i++) {
            for (int j = 0; j < right.getCoeffs().length; j++) {
                res[i * j] = coeffs[i] * right.getCoeffs()[j];
            }
        }

        return new MyPolynominal(res);
    }

    @Override
    public String toString() {
        String s = "";
        for (int i = 0; i < coeffs.length - 1; i++) {
            s = s + coeffs[i] + "^" + i + " + ";
        }
        s = s + coeffs[coeffs.length - 1] + "^" + (coeffs.length - 1);
        return s;
    }
}
