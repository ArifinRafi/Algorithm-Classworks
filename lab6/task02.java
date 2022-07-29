package lab06;

import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class task02 {
	   public static int LCSof3Strings(String A,String B,String C)
	   {
	       int a = A.length();
	       int b = B.length();
	       int c = C.length();
	      
	       int [][][]dp = new int[a+1][b+1][c+1]; //Creating our DP array
	      
	       for(int i=0;i<=a;i++)
	       {
	           for(int j=0;j<=b;j++)
	           {
	               for(int k =0;k<=c;k++)
	               {
	                   if(i==0 || j == 0 || k == 0) //if any of the strings is empty, then the LCS is 0
	                       dp[i][j][k] = 0;
	                   else
	                       if(A.charAt(i-1) == B.charAt(j-1) && B.charAt(j-1) == C.charAt(k-1)) // the char in i,j,k, is same
	                           dp[i][j][k] = dp[i-1][j-1][k-1] + 1;
	                       else
	                       {
	                           //we have 3 choices of skipping a character from each string
	                           dp[i][j][k] = Math.max(Math.max(dp[i-1][j][k], dp[i][j-1][k]), dp[i][j][k-1]);
	                       }
	               }
	           }
	       }
	      
	       return dp[a][b][c]; // returning the LCS of 3 strings
	   }

	   public static void main(String[] args)
	   {
		   try {
				File file = new File("/Users/arifin/eclipse-workspace/CSE 221/src/lab06/input02.txt");
				Scanner in = new Scanner(file);
					
	       String s1 = in.nextLine();
	       String s2 = in.nextLine();
	       String s3 = in.nextLine();
	      
	       System.out.println("Lcs = "+task02.LCSof3Strings(s1, s2, s3));
	       
	       Formatter formatter = new Formatter("/Users/arifin/eclipse-workspace/CSE 221/src/lab06/output02.txt");
			formatter.format("%s \n"  , task02.LCSof3Strings(s1, s2, s3));
			formatter.close();

	   
	   }
		   catch(Exception e) {
				
			}

	}
}

	


