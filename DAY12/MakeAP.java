
import java.util.*;

public class MakeAP {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int c = scanner.nextInt();
            // Your code goes here
            System.out.println(check(a, c));
        }
    }

    public static int check(int a, int c) {
        for (int i = a; i <= c; i++) {
            if ((i - a) == (c - i)) {
                return i;
            }
        }
        return -1;
    }
}
