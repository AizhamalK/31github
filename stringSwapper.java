package ghlChallenge;


    import java.util.Arrays;
    import java.util.HashMap;
import java.util.Map;

public class stringSwapper {
        public static String[] firstSwap(String[] strings) {
            Map<Character, Integer> firstCharIndexMap = new HashMap<>();

            for (int i = 0; i < strings.length; i++) {
                String currentString = strings[i];
                char firstChar = currentString.charAt(0);

                if (firstCharIndexMap.containsKey(firstChar)) {
                    int swapIndex = firstCharIndexMap.get(firstChar);
                    swap(strings, i, swapIndex);

                    firstCharIndexMap.remove(firstChar);
                } else {

                    firstCharIndexMap.put(firstChar, i);
                }
            }

            return strings;
        }

        private static void swap(String[] strings, int index1, int index2) {
            String temp = strings[index1];
            strings[index1] = strings[index2];
            strings[index2] = temp;
        }

        public static void main(String[] args) {
            String[] result1 = firstSwap(new String[]{"ab", "ac"});
            System.out.println(Arrays.toString(result1));

            String[] result2 = firstSwap(new String[]{"ax", "bx", "cx", "cy", "by", "ay", "aaa", "azz"});
            System.out.println(Arrays.toString(result2));

            String[] result3 = firstSwap(new String[]{"ax", "bx", "ay", "by", "ai", "aj", "bx", "by"});
            System.out.println(Arrays.toString(result3)); 
        }
    }

