import java.util.*;
import java.lang.*;
import java.io.*;

class Motivation
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0){
		    int n = sc.nextInt();
		    int x = sc.nextInt();
		    int max = 1;
		    for(int i=0; i<n; i++){
		      int space = sc.nextInt();
		        int rating = sc.nextInt();

		        if(space <= x && rating > max){
		            max = rating;
		        }
		    }

		    System.out.println(max);
		}
	}
}