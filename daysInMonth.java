package ghlChallenge;
// Write a program to print the number of days in a given month using If-Else
//Example
//Input - 1,  Output - 31 days
//Input - 2,  Output - 28/29 days
//Input - 3,  Output - 31 days
//Input - 4,  Output - 30 days
//Input - 12, Output - 31 days
//Input - Any other number - Throw the Exception
import java.util.Scanner;

public class daysInMonth {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the month number: ");
        int month = sc.nextInt();

        if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            System.out.println("Number of days in the month: 31 days");

        } else if (month == 4 || month == 6 || month == 9 || month == 11) {

            System.out.println("Number of days in the month: 30 days");
        } else if (month == 2) {
            System.out.println("Number of days in the month: 28/29 days");
        } else {
            System.out.println("Invalid month number!");
        }
    }
}
