import java.util.Scanner;

public class Substring {

    public static void main(String[] args) {
        long startTime = System.nanoTime();

        Scanner in = new Scanner(System.in);
        String s = in.next();
        int start = in.nextInt();
        int end = in.nextInt();

        System.out.println(s.substring(start, end));
        System.out.println("Ci ho messo: " + (System.nanoTime() - startTime));
    }
}