import java.util.ArrayList;
import java.util.Collections;

public class Median {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        double result = findMedianSortedArrays(new int[]{1, 2}, new int[]{3, 4});

        System.out.println("Ci ho messo: " + (System.nanoTime() - startTime));
        System.out.print("Il valore mediano è " + result);
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int counter = nums1.length > nums2.length ? nums1.length : nums2.length;
        ArrayList<Integer> output = new ArrayList<>();

        for (int i = 0; i < counter; i++) {

            if (i < nums1.length) {
                output.add(nums1[i]);
            }

            if (i < nums2.length) {
                output.add(nums2[i]);
            }
        }

        Collections.sort(output);

        double result;
        int index = output.size() / 2;
        if ((output.size() % 2 == 0)) {

            result = ((double) (output.get(index - 1) + output.get(index))) / 2;
        } else {
            result = output.get(index);
        }

        return result;
    }
}
