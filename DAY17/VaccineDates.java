
import java.lang.*;
import java.util.*;

class VaccineDates {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int d = sc.nextInt();
            int l = sc.nextInt();
            int r = sc.nextInt();
            if (d <= r && d >= l) {
                System.out.println("Take second dose now");
            } else if (d < l) {
                System.out.println("Too early");
            } else {
                System.out.println("Too late");
            }
        }
    }
}
