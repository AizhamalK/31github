package ghlChallenge;

import java.util.Scanner;


    public class teenagerChecker {
        public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

            try {
                System.out.print("Please enter your age: ");
                int age = input.nextInt();

                if (age < 0 || age > 100) {
                    System.out.println("Invalid age!");
                } else if (age >= 13 && age <= 19) {
                    System.out.println("You are a teenager!");
                } else {
                    System.out.println("You are not a teenager.");
                }
            } catch (Exception e) {
                System.out.println("Invalid input!");
            } finally {
                input.close();
            }}}


