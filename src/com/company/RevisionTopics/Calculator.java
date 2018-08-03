package com.company.RevisionTopics;

public class Calculator {

    public static int sum(int a, int b){

        return a + b;
    }

    public static int sumAll(int... integers){
        int sum = 0;
        for(int integer : integers){

            sum += integer;

       }
        return sum;
    }

    public static String stringSum(String... strings){
        String sum = "";
        for (String string : strings){
            sum += string;
        }
        return sum;
    }


}
