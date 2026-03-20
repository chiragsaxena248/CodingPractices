
import java.util.Scanner;

public class CandyStore {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int x = scanner.nextInt();
            int y = scanner.nextInt();
            // Your code goes here
            if (y > x) {
                System.out.println((x * 1) + ((y - x) * 2));
            } else {
                System.out.println((y * 1));
            }
        }
    }
}
