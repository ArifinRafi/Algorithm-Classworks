import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class task_01 {
	static int [] bubbleSort(int arr[], int n) {

		if (n == 1)
			return arr;

		for (int i = 0; i < n - 1; i++) {
			if (arr[i] > arr[i + 1]) {

				int temp = arr[i];
				arr[i] = arr[i + 1];
				arr[i + 1] = temp;
			}
		}

		return bubbleSort(arr, n - 1);
	}

	public static void main(String[] args) {
		try {
			File file = new File("/Users/arifin/eclipse-workspace/CSE 221/src/Input01");
			Scanner in = new Scanner(file);
			
				int n = in.nextInt();
				int []a = new int[n];
				for (int i = 0; i<n; i++) {
					a[i] = in.nextInt();
					//System.out.println(a[i]+" ,");
					
				}
				 bubbleSort(a, a.length);
				 
				 Formatter formatter = new Formatter("/Users/arifin/eclipse-workspace/CSE 221/src/Output01.txt");
				 
				for (int i = 0; i<n; i++) {
					formatter.format("%s \n"  , a[i] );
					
				}
				formatter.close();
				
			
		}
		catch(Exception e) {
			
		}
	}
}
