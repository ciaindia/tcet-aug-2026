/*
CLASS WORK
WAP to create random jackpot number and take input from user to guess the number. 

Based on level the attempt to guess the number should change

Number of attempts: 10

Print hint if the number is greater or smaller

*/

import java.util.Scanner;
import java.util.Random;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //Randomly generate jackpot number 1 - 100 range
        Random random = new Random();
        int number = random.nextInt(100) + 1;
        int jackpot = number;

        for(int i = 1; i <= 10; i++) {
            System.out.print("Guess a number: ");
            int guess = sc.nextInt();
            
            if(jackpot == guess) {
                System.out.println("7 crore You won");
                break;
            }
            
            if(jackpot > guess) {
                System.out.println("Jackpot is greater than " + guess);
            }
            
            if(jackpot < guess) {
                System.out.println("Jackpot is smaller than " + guess);
            }
        }

    }
}