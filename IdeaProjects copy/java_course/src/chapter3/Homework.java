package chapter3;

import java.util.Scanner;

public class Homework {

    public static void main(String args[]){

        double pennies = .01;
        double nickles = .05;
        double dimes = .10;
        double quarters = .25;
        int oneDollar = 1;

        System.out.println("How many pennies?");
        Scanner scanner = new Scanner(System.in);
        double penniesCount = scanner.nextDouble();

        System.out.println("How many nickles?");
        double nicklesCount = scanner.nextDouble();

        System.out.println("How many dimes?");
        double dimesCount = scanner.nextDouble();

        System.out.println("How many quarters?");
        double quartersCount = scanner.nextDouble();
        scanner.close();

        double penniesTotal = pennies * penniesCount;
        double nicklesTotal = nickles * nicklesCount;
        double dimesTotal = dimes * dimesCount;
        double quartersTotal = quarters * quartersCount;
        double sum = penniesTotal + nicklesTotal + dimesTotal + quartersTotal;

        if(sum == oneDollar) {
            System.out.println("You win the game!");
             }
        else if (sum < oneDollar) {
            double lessDollar = oneDollar - sum;
            System.out.println("This amount is $" + lessDollar + " less than one dollar.");
        }
        else if (sum > oneDollar) {
            double moreDollar = sum - oneDollar;
            System.out.println("This amount is $" + moreDollar + " more than one dollar.");
        }
        else {
            System.out.println("An error occurred and a total could not be given.");
        }
    }

}
