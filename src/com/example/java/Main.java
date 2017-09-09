package com.example.java;

public class Main {

    public static void main(String[] args) {
	// Create a program that demonstrates different operators and display them.

       int firstInt, secondInt;
       firstInt = 72;
       secondInt = 13;

       int resultOne = firstInt + secondInt;
       System.out.println("Add: " + firstInt + " + " + secondInt + " = " + resultOne);

       int resultTwo = firstInt - secondInt;
       System.out.println("Subtract: " + firstInt + " - " + secondInt + " = " + resultTwo);

       int resultThree = firstInt * secondInt;
       System.out.println("Multiply: " + firstInt + " x " + secondInt + " = " + resultThree);

       int resultFour = firstInt / secondInt;
       System.out.println("Divide: " + firstInt + " / " + secondInt + " = " + resultFour);

       int resultFive = firstInt % secondInt;
       System.out.println("Remainder: " + firstInt + " % " + secondInt + " = " + resultFive);

       float resultSix = (float) firstInt /secondInt;
       System.out.println("Divide #2: " + firstInt + " / " + secondInt + " = " + resultSix);





    }
}
