
import java.util.*;

public class TestAverages {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int a = scanner.nextInt();
            int b = scanner.nextInt();
            int c = scanner.nextInt();
            // Your code goes here
            if ((a + b) / 2 < 35 || (b + c) / 2 < 35 || (a + c) / 2 < 35) {
                System.out.println("Fail");
            } else {
                System.out.println("Pass");
            }
        }
    }
}
