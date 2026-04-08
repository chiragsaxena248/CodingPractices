
import java.lang.*;
import java.util.*;

class TurnIt {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int T = sc.nextInt();

        while (T-- > 0) {
            int U = sc.nextInt();
            int V = sc.nextInt();
            int A = sc.nextInt();
            int S = sc.nextInt();

            int finalSpeedSquared = U * U - 2 * A * S;

            if (finalSpeedSquared <= V * V) {
                System.out.println("Yes");
            } else {
                System.out.println("No");
            }
        }
    }
}
