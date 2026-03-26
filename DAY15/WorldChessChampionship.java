
import java.util.*;

public class WorldChessChampionship {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        while (T-- > 0) {
            int X = sc.nextInt();
            String s = sc.next();

            int c = 0, n = 0;

            for (char ch : s.toCharArray()) {
                if (ch == 'C') {
                    c += 2;
                } else if (ch == 'N') {
                    n += 2;
                } else {
                    c++;
                    n++;
                }
            }

            if (c > n) {
                System.out.println(60 * X);
            } else if (c < n) {
                System.out.println(40 * X);
            } else {
                System.out.println(55 * X);
            }
        }
    }
}
