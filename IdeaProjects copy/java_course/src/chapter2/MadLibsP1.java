//declaring the package
package chapter2;

import java.util.Scanner;

//class - design plan
public class MadLibsP1 {

    //Always enter the default/main method as the first method
    public static void main(String arg[]) {

        //Get the season
        System.out.println("Enter a season of the year.");
        Scanner scanner = new Scanner(System.in);
        String season = scanner.next();

        //Get the whole number
        System.out.println("Enter a whole number.");
        int number = scanner.nextInt();

        //Get the adjective
        System.out.println("Enter an adjective.");
        String adjective = scanner.next();

        scanner.close();

        //Put together the mad lib
        System.out.println("On a " + adjective + " " + season + " day, I drink a minimum of " + number + " cups of coffee. ");


    }
}
