
public class HammingDistance {

    public static void main(String[] args) {

        long startTime = System.nanoTime();
        double result = hammingDistance(1, 4);

        System.out.println("Ci ho messo: " + (System.nanoTime() - startTime));
        System.out.print("L'hamming distance è " + result);
    }

    public static int hammingDistance(int x, int y) {
        return Integer.bitCount(x ^ y);
    }
}