import java.util.ArrayList;
import java.util.List;

public class LengthOfLongestSubstringOptimized {

    public static void main(String[] args) {
        String inputPart = "\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!\\\"#$%&'()*+,-./:;<=>?@[\\\\]^_`{|}~ ";
        StringBuilder theString = new StringBuilder(inputPart);
        for (int i = 0; i < 320; ++i) {
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
        List<Character> subString = new ArrayList<>();

        int counter = 1;

        for (int i = 0; i < chars.length; i++) {

            char currentChar = chars[i];
            boolean isLastLap = i == chars.length - 1;

            if (subString.contains(currentChar)) {

                counter = Math.max(subString.size(), counter);
                int firstDoubleCharIndex = subString.indexOf(currentChar);

                if (firstDoubleCharIndex == subString.size() - 1) {
                    subString = new ArrayList<>();
                } else {
                    List<Character> cancelList = subString.subList(0, firstDoubleCharIndex + 1);
                    subString.removeAll(cancelList);
                }
            }
            subString.add(currentChar);

            if (isLastLap) {
                counter = Math.max(subString.size(), counter);
            }
        }
        return counter;
    }
}
