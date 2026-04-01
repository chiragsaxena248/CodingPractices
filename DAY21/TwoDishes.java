
import java.lang.*;
import java.util.*;

class TwoDishes {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int c = sc.nextInt();

            int totalDishes = Math.min(b, a + c);

            if (totalDishes >= n) {
                System.out.println("YES");
            } else {
                System.out.println("NO");
            }
        }
    }
}
