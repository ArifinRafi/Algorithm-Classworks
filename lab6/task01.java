package lab06;
import java.io.File;
import java.util.Formatter;
import java.util.Scanner;
public class task01 {

	public static int LCS(String actualZones, String predictedZones) {
		//set m and n
		int m = actualZones.length() + 1;
		int n = predictedZones.length() + 1;

		// create two dimenstional arrays of
		// dimention mxn

		int[][] c = new int[m][n]; // stores the length of longest subsequences
		int[][] t = new int[m][n]; // stores directions for the longest subsequences
		// -1 undefined
		// 0 diagonal
		// 1 up
		// 2 left

		for (int i = 1; i < m; i++) {
			c[i][0] = 0; // common sequence length is 0
			t[i][0] = -1; // direction undefined
		}

		for (int j = 0; j < n; j++) {
			c[0][j] = 0; // common sequence length is 0
			t[0][j] = -1;
		}

		// loop over all possible length of actualZones
		for (int i = 1; i < m; i++) {
			// loop over all lengths of predictedZones
			for (int j = 1; j < n; j++) {
				if (actualZones.charAt(i - 1) == predictedZones.charAt(j - 1)) {
					// same charactes. increase the common sequence count
					c[i][j] = c[i - 1][j - 1] + 1;
					t[i][j] = 0; // diagonal
				}
				else if (c[i - 1][j] >= c[i][j - 1]) {
					// set similiar to up cost
					c[i][j] = c[i - 1][j];
					t[i][j] = 1;
				}
				else {
					c[i][j] = c[i][j - 1];
					t[i][j] = 2; // left
				}
			}
		}

		// print the longest subsequence zones
		printLCS(actualZones, t, m - 1, n - 1);
		System.out.println(); // print newline

		// c[m-1][n-1] contains the longest common subsequence
		return c[m-1][n-1];

	}

	// prints the longest subsequence
	public static void printLCS (String actualString, int[][] t, int i, int j) {
		// if t[i][j] == -1 return
		if (t[i][j] == -1) {
			return;
		}
		// if t[i][j] == 0, this means zones matched at this position
		if (t[i][j] == 0) {
			// recursively call to print from diagonal up
			printLCS(actualString, t, i - 1, j - 1);
			// print this word
			System.out.print(getZoneName(actualString.charAt(i - 1)) + " "); // get the zone name by code
		}
		else if(t[i][j] == 1) {
			// go up
			printLCS(actualString, t, i - 1, j);
		}
		else {
			// go left
			printLCS(actualString, t, i, j - 1);
		}
	}

	/**
	 * Returns the Zone name given a keyword
	 */
	public static String getZoneName(char keyWord) {
		// use switch to return the appropriate string
		switch(keyWord) {
		case 'Y':
			return "Yasnaya";
		case 'P':
			return "Pochinki";
		case 'S':
			return "School";
		case 'R':
			return "Rozhok";
		case 'F':
			return "Farm";
		case 'M':
			return "Mylta";
		case 'H':
			return "Shelter";
		case 'I':
			return "Prison";
		default:
			return "Undefined";
		}
	}

	public static void main(String[] args) {
		
		try {
			File file = new File("/Users/arifin/eclipse-workspace/CSE 221/src/lab06/input01.txt");
			Scanner in = new Scanner(file);// Scanner or input
		// get the number of zones
		int n = in.nextInt();
		// get zoneSequence of match
		String actualZones = in.next();
		String predictedZones = in.next();
		

		// get the length of LCS
		int lenLCS = LCS(actualZones, predictedZones);

		// calculate correctnes according to formula given
		int correctness = (lenLCS * 100) / n;
		// print
		Formatter formatter = new Formatter("/Users/arifin/eclipse-workspace/CSE 221/src/lab06/Output01.txt");
		formatter.format("%s \n"  , correctness + "%" );
		 
		System.out.println("Correctnes of prediction: " + correctness + "%");
		formatter.close();
		
	}
	catch(Exception e) {
		
	}

}
}


