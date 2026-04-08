import java.util.*;
import java.lang.*;
import java.io.*;

class WeightBalance
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int w1 = sc.nextInt();
		    int w2 = sc.nextInt();
		    int x1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int m = sc.nextInt();
		    
		    int gain = w2 - w1;
		    int minGain = x1 * m;
		    int maxGain = x2 * m;
		    
		    if(gain >= minGain && gain <=  maxGain)
		        System.out.println(1);
		    else 
		        System.out.println(0);
		}
	}
}
