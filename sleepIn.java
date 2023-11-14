package ghlChallenge;

public class sleepIn {
    public static void main(String[] args) {
        // Test cases
        System.out.println(sleepIn(false, false)); // true
        System.out.println(sleepIn(true, false));  // false
        System.out.println(sleepIn(false, true));  // true
    }

    public static boolean sleepIn(boolean weekday, boolean vacation) {
        // We can sleep in if it's not a weekday or we're on vacation
        return !weekday || vacation;
    }
}

