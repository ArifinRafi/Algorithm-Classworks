import java.util.Scanner;

//Sorting method for less complexity
public class Lab2 {
	public static int[] Bubble_Sorting(int[] a, int i) {
		if (i == a.length) { return a;
		}
		else {
      
		for (int j = 0; j < a.length - 1; j++) { // take one for loop for the whole iteration to reduce complexity

			if (a[j] > a[j + 1]) {
				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}
		
		
	}
		return Bubble_Sorting(a, i+1);
      
	}

	// tester class(if needed)
	
}
