
import java.lang.*;
import java.util.*;

class BinaryBattles {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int matchTime = 0;
            for (int i = n; i >= 1; i = n / 2) {
                matchTime += a;

                if (i % 2 == 0) {
                    matchTime += b;
                }
                n = n / 2;
            }

            System.out.println((matchTime));
        }

    }
}
/*
4
4 10 5
16 30 5
32 45 15
1024 23 9 */
