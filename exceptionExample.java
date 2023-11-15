package ghlChallenge;

import java.util.InputMismatchException;
import java.util.Scanner;

public class exceptionExample {
        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Enter two numbers");
            int numbers [] = {2, 5, 7, 8};


            try {
                int num1 = scan.nextInt(), num2= scan.nextInt();
                System.out.println(num1/num2);
                System.out.println(numbers[4]);
            }catch (InputMismatchException e ){
                System.out.println("Please try after hangover, enter numbers only");
            } catch (ArithmeticException e){
                System.out.println("Please study maths, we cannot divide with zero");
            }catch (Exception e) {
                System.out.println("Something went wrong! Please try after sometime");
            }

            System.out.println("Welcome to the party");
            System.out.println("Enjoy your dinner");
        }}
