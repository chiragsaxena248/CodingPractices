
import java.lang.*;
import java.util.*;

class ChefandSpells {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            long a = sc.nextInt();
            long b = sc.nextInt();
            long c = sc.nextInt();

            long num = Math.max(a + b, Math.max(b + c, c + a));
            System.out.println(num);
        }
    }
}
