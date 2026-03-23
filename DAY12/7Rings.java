
import java.util.*;

public class 

     7Rings {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();

        while (t-- > 0) {
            int n = scanner.nextInt();
            int x = scanner.nextInt();
            // Your code goes here
            int num = n * x;
            check(num);
        }
    }

    public static void check(int num) {
        int i = 0;
        while (num > 0) {
            i++;
            num = num / 10;
        }
        if (i != 5) {
            System.out.println("No"); 
        }else {
            System.out.println("Yes");
        }
    }
}
