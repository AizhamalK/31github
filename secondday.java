package ghlChallenge;

import java.util.Scanner;


    // Create a class & take two integer values from the user
//Perform division operation & handle the appropriate Exception
//Create a String variable with a null value
//Find the length of the null variable and handle the appropriate Exception
//Create an array of five integers
//Access the element at the fifth position
//Handle the appropriate Exception

public class secondday {
        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the first integer: ");
            int num1 = sc.nextInt();
            System.out.print("Enter the second integer: ");
            int num2 = sc.nextInt();

            try {
                int result = num1 / num2;
                System.out.println("Result of division: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Cannot divide by zero!");
            }

            String str = null;
            try {
                int length = str.length();
                System.out.println("Length of string: " + length);
            } catch (NullPointerException e) {
                System.out.println("The string is null!");
            }

            int[] nums = new int[5];

            try {
                int fifthNum = nums[4];
                System.out.println("Fifth number in the array: " + fifthNum);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array index is out of bounds!");
            }
        }
}
