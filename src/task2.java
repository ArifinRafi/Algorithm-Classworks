import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class task2 {
	public static int[] Selection_Sort(int[] a) {
		int max;
		int min_id;

		for (int i = 0; i < a.length - 1; i++) {
			max = a[i];
			min_id = i;

			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					min_id = j;
					int temp = a[i];
					a[i] = a[min_id];
					a[j] = temp;

				}
			}

		}
		return a;
	}
	//test class to see the output
	public static void main(String[] args) {
		try {
			File file = new File("/Users/arifin/eclipse-workspace/CSE 221/src/Input2.txt");
			Scanner in = new Scanner(file);
			
				int n = in.nextInt();
				int l = in.nextInt();
				int []a = new int[n];
				for (int i = 0; i<n; i++) {
					a[i] = in.nextInt();
					//System.out.println(a[i]+" ,");
					
				}
				 Selection_Sort(a);
				 
				 Formatter formatter = new Formatter("/Users/arifin/eclipse-workspace/CSE 221/src/Output02.txt");
				 
				for (int i = 0; i<l; i++) {
					formatter.format("%s \n"  , a[i] );
					
				}
				formatter.close();
				
			
		}
		catch(Exception e) {
			
		}
	}
}
