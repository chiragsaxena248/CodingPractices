import java.util.*;
import java.lang.*;
import java.io.*;


class BinaryBattles
{
    public static void main(String[] args) throws java.lang.Exception
    {
        // your code goes here
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t--> 0) {
            int n = sc.nextInt();
            int a = sc.nextInt();
            int b = sc.nextInt();
            int rounds = (int)(Math.log(n) / Math.log(2));
            int total = rounds * a + (rounds - 1) * b;
            System.out.println(total);
        }
    }
}