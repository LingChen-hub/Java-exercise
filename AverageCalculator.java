package com.lingdecompany;

import java.util.Scanner;

public class AverageCalculator {
    public void AverageCalculator() {
        Scanner input = new Scanner(System.in);
        double total = 0;
        double grade = 0;
        int counter = 0;
        double average;

        do {
            System.out.println("input one number " + counter + ":");
            grade = input.nextShort();
            total = total + grade;
            counter++;
        } while (grade != 0); //这里不能用while，否则循环直接就终结了，因为grade的初始值是0

        average = total / (counter - 1);
        System.out.println("You've inputed " + (counter - 1) + " grades");
        System.out.println("Your average is " + average);
    }
}