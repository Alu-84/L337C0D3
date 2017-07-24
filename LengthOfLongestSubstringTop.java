import java.util.*;

public class LengthOfLongestSubstringTop {

    public static void main(String[] args) {
        String inputPart = "\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ ";
        StringBuilder theString = new StringBuilder(inputPart);
        for (int i = 0; i < 320; ++i)
        {
            theString.append(inputPart);
        }

        long startTime = System.nanoTime();
        int result = lengthOfLongestSubstring(theString.toString());

        System.out.println("Ci ho messo: " + (System.nanoTime() - startTime));
        System.out.print("La stringa più lunga è di " + result + " caratteri");
    }

    public static int lengthOfLongestSubstring(String string) {

        if (string == null || string.isEmpty()) {
            return 0;
        }

        char[] chars = string.toCharArray();
        int maxCounter = 0;
        int counter = 0;
        Map<Character, Integer> indexMap = new HashMap<>();

        for (int i = 0; i < chars.length; i++) {

            char currentChar = chars[i];
            Integer index = indexMap.getOrDefault(currentChar, -1);

            if (index == -1) {
                indexMap.put(currentChar, i);
                counter++;
            } else {
                i = index;
                maxCounter = Math.max(maxCounter, counter);
                counter = 0;
                indexMap.clear();
            }

            boolean isLastLap = i == chars.length - 1;
            if (isLastLap) {
                maxCounter = Math.max(maxCounter, counter);
            }
        }
        return maxCounter;
    }
}
