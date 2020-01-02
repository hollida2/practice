package chapter5;

import java.util.Scanner;

/*PHONE BILL CALCULATOR EXERCISE
*Calculate the final total of someone's cell phone bill.
* Allow the operator to input the plan fee and the number
* of overage minutes
 */
public class HomeworkPhoneBillCalculator {

    static double tax = 0.15;
    static double overageCharge = 0.25;
    static Scanner scanner = new Scanner(System.in);

    public static void main(String args[]){

        double calculateTax = getTax();
        double calculateOverageFees = getOverageFees();

        scanner.close();

        getFinalTotal(calculateTax, calculateOverageFees);

    }

    public static double getTax(){
        System.out.println("Enter your cell phone plan fee:");
        double calculateTax = scanner.nextDouble() * tax;
        return calculateTax;
    }

    public static double getOverageFees() {
        System.out.println("Enter the number of overage minutes");
        double calculateOverageFees = scanner.nextDouble() * overageCharge;
        return calculateOverageFees;
    }

    public static void getFinalTotal(double calculateTax, double calculateOverageFees){
        double phoneBill = calculateTax / tax;
        double totalBill = phoneBill + calculateTax + calculateOverageFees;

        System.out.println("Phone Bill Statement");
        System.out.println("Plan: " + phoneBill);
        System.out.println("Overage: " + calculateOverageFees);
        System.out.println("Tax: " + calculateTax);
        System.out.println("Total " + totalBill);

    }

}
