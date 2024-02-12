package ex1.exercise31;

import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Введите число: ");
        int number = input.nextInt();
        input.close();

        if(isArmstrong(number)){
            System.out.println(number + " - число Армстронга.");
        } else {
            System.out.println(number + " - не является числом Армстронга.");
        }
    }

    public static boolean isArmstrong(int number) {

        int temp = number;
        int sum = 0;
        int length = String.valueOf(number).length();

        while(temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit,length);
            temp /= 10;
        }

        return sum == number;
    }
}