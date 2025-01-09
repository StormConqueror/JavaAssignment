package Arrays;
import java.util.Scanner;
public class Task10 {
    public static int[][] multarr;
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int s = sc.nextInt();
        multarr = new int[s][];
        for (int i = 0; i < s; i++) {
            int size = sc.nextInt();
            multarr[i] = new int[size];
        }

        for (int[] row : multarr) {
            System.out.println(java.util.Arrays.toString(row));
        }
    }
}
