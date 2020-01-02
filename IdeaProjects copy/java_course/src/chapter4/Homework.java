package chapter4;

/*The objective of this game is to travel the entire game board of 20 spaces within 5 die rols
*Chapter 4 Homework assignment
 */

import java.util.Random;

public class Homework {

    public static void main(String args[]){

        int rolls = 5;
        int spacesToWin = 20;
        int total = 0;
        Random random = new Random();

        System.out.println("Welcome to Roll the Die! Let's begin...");

        for(int i = 0; i < rolls; i++) {
            int die = random.nextInt(6) + 1;
            total = total + die;

            if(total == spacesToWin){
                System.out.println("You rolled a " + die + ". You're on space 20. Congrats, you win!");
                    break;
                }
            else{
                  int spaces = spacesToWin - total;
                  System.out.println("You rolled a " + die + ". You are now on space " + total + " and you have " + spaces + " more to go.");
                }

            }
         if(total > spacesToWin||total <spacesToWin){
             System.out.println("The total amount of spaces achieved was " + total + " and you were not able to get 20 spaces exactly after 5 rolls, you lose.");
         }
    }
}

