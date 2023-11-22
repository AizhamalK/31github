package ghlChallenge;


public class MakeChocolate {
    public static int makeChocolate(int small, int big, int goal) {

        int maxBigBars = goal / 5;

        int numBigBarsUsed = Math.min(big, maxBigBars);

        int remainingGoal = goal - (numBigBarsUsed * 5);
        
        if (remainingGoal <= small) {
            return remainingGoal;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        // Example usage:
        System.out.println(makeChocolate(4, 1, 9));  // Output: 4
        System.out.println(makeChocolate(4, 1, 10)); // Output: -1
        System.out.println(makeChocolate(4, 1, 7));  // Output: 2
    }
}



