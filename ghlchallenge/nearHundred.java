package ghlChallenge;

public class nearHundred {
        public static void main(String[] args) {
            System.out.println(nearHundred(93));  // true
            System.out.println(nearHundred(90));  // true
            System.out.println(nearHundred(89));  // false
        }

        public static boolean nearHundred(int n) {

            // Check if the absolute difference between n and 100 or 200 is within 10
            return (Math.abs(100 - n) <= 10) || (Math.abs(200 - n) <= 10);
        }
    }

