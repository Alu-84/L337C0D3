package sorting;

public class BubbleSort {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        int[] result = bubbleSort(new int[]{1, 5, 4, 7, 9, 8, 3});

        System.out.println("Ci ho messo: " + (System.nanoTime() - startTime));

        for (int i = 0; i < result.length; i++) {
            System.out.print(" " + result[i]);
        }
    }

    public static int[] bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {

                if (array[j] > array[j + 1]) {
                    switchPlace(array, j, j + 1);
                }
            }
        }

        return array;
    }

    private static void switchPlace(int[] array, int firstIndex, int secondIndex) {
        int tmp;
        tmp = array[firstIndex];
        array[firstIndex] = array[secondIndex];
        array[secondIndex] = tmp;
    }
}
