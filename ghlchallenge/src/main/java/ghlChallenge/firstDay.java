package ghlChallenge;

import java.util.Scanner;

public class firstDay {
    public static void main(String[] args) {

    int data [][]= new int [3][3];
    Scanner scan = new Scanner(System.in);

   for (int i = 0; i<data.length; i++){
        System.out.println("Enter data in row "+ (i+1));

        int max = data[i][0];

        for (int j = 0; j<data[i].length;j++){
            data [i][j] = scan.nextInt();
            if (data[i][j]> max) {
                max = data [i][j];
            }

        }
        System.out.println("Greatest in row " + (i+1)+ " is " +max);
    }}
}
