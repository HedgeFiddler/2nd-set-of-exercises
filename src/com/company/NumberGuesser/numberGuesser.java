package com.company.NumberGuesser;

import java.util.Random;
import java.util.Scanner;

public class numberGuesser {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(10000);
        Scanner input = new Scanner(System.in);
        for (int i = 1 ; i < 999 ; i++) {
            System.out.println("Please enter your guess for the random number");
            int guess = input.nextInt();
            if(guess > randomNumber){
                System.out.println("The number is smaller");
            }
            if (guess < randomNumber){
                System.out.println("The number is higher");
            }
            if(guess == randomNumber){
                System.out.println("Congrats, you guessed it in " + i + "tries!");
                return;
            }


        }
    }


//    public static void guessNumber(int number){
//        Scanner input = new Scanner(System.in);
//        for (int i = 0; i >= 10000 ; i++) {
//            System.out.println("Please enter your guess for the random number");
//            int guess = input.nextInt();
//            if(guess > number){
//                System.out.println("The number is smaller");
//            }
//            if (guess < number){
//                System.out.println("The number is higher");
//            }
//            if(guess == number){
//                System.out.println("Congrats, you guessed it in " + i + "tries!");
//                return;
//            }
//
//
//        }
//    }

}
