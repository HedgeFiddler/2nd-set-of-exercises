package com.company.RevisionTopics;

public class DoubleComparison {
    public static void main(String[] args) {

        double v = 1.3 / 3.1;
        double v2 = 3.9 / 9.3;

        System.out.println(Math.abs(v - v2) < 0.00001);
        System.out.println("v2 = " + v2);
        System.out.println("v = " + v);

    }

    public boolean isEqual(double a, double b, double delta){

        return Math.abs(a - b) < delta;


    }
}
