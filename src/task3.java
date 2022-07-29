import java.io.File;
import java.util.Formatter;
import java.util.Scanner;

public class task3 {
	public static int[] Insertion(int[] a) {
		for (int k = 1; k < a.length; k++) {
			int temp = a[k];
			int j = k - 1;
			while (j >= 0 && temp <= a[j]) {
				a[j + 1] = a[j];
				j = j - 1;
			}
			a[j + 1] = temp;
		}
		return a;

	}

	// test class to see output
	public static void main(String[] args) {
		try {
			File file = new File("/Users/arifin/eclipse-workspace/CSE 221/src/Input3.txt");
			Scanner in = new Scanner(file);

			int n = in.nextInt();
			int[] a = new int[n];
			int[] b = new int[n];
			a = Insertion(a);
			b = Insertion(b);

			Formatter formatter = new Formatter("/Users/arifin/eclipse-workspace/CSE 221/src/Output03.txt");

			for (int i = 0; i < n; i++) {
				formatter.format("%s \n", a[i]);

			}
			formatter.close();

		} catch (Exception e) {

		}
	}

}
