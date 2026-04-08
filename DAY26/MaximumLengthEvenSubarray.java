
import java.lang.*;
import java.util.*;

class MaximumLengthEvenSubarray {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int N = sc.nextInt();

            if (N % 4 == 0 || N % 4 == 3) {
                System.out.println(N);
            } else {
                System.out.println(N - 1);
            }
        }
    }
}
