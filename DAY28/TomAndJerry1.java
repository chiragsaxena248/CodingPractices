
import java.lang.*;
import java.util.*;

class TomAndJerry1 {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();
            int d = sc.nextInt();
            int K = sc.nextInt();

            int dist = Math.abs(a - c) + Math.abs(b - d);

            if (K >= dist && (K - dist) % 2 == 0) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
