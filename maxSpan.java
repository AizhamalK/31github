package ghlChallenge;

public class maxSpan {
        public static void main(String[] args) {
            System.out.println(maxSpan(new int[]{1, 2, 1, 1, 3}));
            System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 1, 4}));
            System.out.println(maxSpan(new int[]{1, 4, 2, 1, 4, 4, 4}));
        }

        public static int maxSpan(int[] nums) {
            int maxSpan = 0;

            for (int i = 0; i < nums.length; i++) {
                for (int j = nums.length - 1; j >= i; j--) {
                    if (nums[i] == nums[j]) {

                        int span = j - i + 1;
                        maxSpan = Math.max(maxSpan, span);
                        break;
                    }
                }
            }
            return maxSpan;
        }
    }

}
