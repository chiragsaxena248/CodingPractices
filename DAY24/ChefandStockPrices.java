
import java.lang.*;
import java.util.*;

class ChefandStockPrices {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int S = sc.nextInt();
            int A = sc.nextInt();
            int B = sc.nextInt();
            int C = sc.nextInt();

            double newPrice = S * (100 + C) / 100.0;

            if (newPrice >= A && newPrice <= B) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
