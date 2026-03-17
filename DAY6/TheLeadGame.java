import java.util.*;
import java.lang.*;
import java.io.*;

class TheLeadGame
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
        int p1 = 0, p2 = 0;
        int maxLead = 0, winner = 0;

        for (int i = 0; i < n; i++) {
            int s1 = sc.nextInt();
            int s2 = sc.nextInt();

            p1 += s1;
            p2 += s2;
            int lead ;
            if((p1-p2)<0)
            lead = (p2-p1);
            else 
            lead = p1-p2;


            if (lead > maxLead) {
                maxLead = lead;
                if(p1>p2)
                winner = 1;
                else winner = 2;
            }
        }

        System.out.println(winner + " " + maxLead);
    }
}