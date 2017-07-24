import com.sun.org.apache.xalan.internal.xsltc.util.IntegerArray;

public class TwoSumBruteForce {

    public static void main(String[] args) {
        int[] results = twoSum(new int[]{3, 2, 3}, 6);

        if (results.length != 0) {
            System.out.print("Risultati indici: " + results[0] + " " + results[1]);
        }
    }

    public static int[] twoSum(int[] nums, int target) {
        int[] empty = {};
        int length = nums.length;

        if ((length < 2)) {
            return empty;
        }

        for (int i = 0; i < length - 1; i++) {
            for (int j = i + 1; j < length; j++) {
                if (nums[i] + nums[j] == target) {
                    return new int[]{i, j};
                }
            }
        }
        return empty;
    }
}
