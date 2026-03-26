
import java.util.*;

public class ConvertStringtoTitleCase {

    public static void main(String[] args) throws java.lang.Exception {
        // your code goes here
        Scanner sc = new Scanner(System.in);
        int T = Integer.parseInt(sc.nextLine());

        while (T-- > 0) {
            String s = sc.nextLine();
            System.out.println(toTitleCase(s));
        }
    }

    public static String toTitleCase(String s) {
        String[] words = s.split(" ");
        StringBuilder ans = new StringBuilder();

        for (int i = 0; i < words.length; i++) {
            String w = words[i];

            if (w.equals(w.toUpperCase())) {
                ans.append(w);
            } else {
                ans.append(Character.toUpperCase(w.charAt(0)));
                ans.append(w.substring(1).toLowerCase());
            }

            if (i != words.length - 1) {
                ans.append(" ");
            }
        }

        return ans.toString();
    }
}
