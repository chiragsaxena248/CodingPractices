
import java.lang.*;
import java.util.*;

public class SecondMaxof3Numbers {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n-- > 0) {
            int[] arr = new int[3];
            int max = Integer.MIN_VALUE;
            int min = 0;
            for (int i = 0; i < 3; i++) {
                arr[i] = sc.nextInt();
                if (arr[i] > max) {
                    max = arr[i];
                }
            }
            for (int i = 0; i < 3; i++) {
                if (arr[i] < max && arr[i] >= min) {
                    min = arr[i];
                }
            }

            System.out.println(min);
        }
    }
}
