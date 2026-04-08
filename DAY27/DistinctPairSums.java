
import java.lang.*;
import java.util.*;

class DistinctPairSums {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int L = sc.nextInt();
            int R = sc.nextInt();

            System.out.println(2 * (R - L) + 1);
        }

        sc.close();
    }
}
