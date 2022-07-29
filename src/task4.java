import java.util.Scanner;

public class task4 {

	void merge(int arr[], int l, int m, int r) {
		// Find sizes of two subarrays to be merged
		int n1 = m - l + 1;
		int n2 = r - m;

		/* Create temp arrays */
		int L[] = new int[n1];
		int R[] = new int[n2];

		/* Copy data to temp arrays */
		for (int i = 0; i < n1; ++i)
			L[i] = arr[l + i];
		for (int j = 0; j < n2; ++j)
			R[j] = arr[m + 1 + j];

		

		// Initial indexes of first and second subarrays
		int i = 0, j = 0;

		
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= R[j]) {
				arr[k] = L[i];
				i++;
			} else {
				arr[k] = R[j];
				j++;
			}
			k++;
		}

		
		while (i < n1) {
			arr[k] = L[i];
			i++;
			k++;
		}

		
		while (j < n2) {
			arr[k] = R[j];
			j++;
			k++;
		}
	}

	
	void sort(int arr[], int l, int r) {
		if (l < r) {
			// Find the middle point
			int m = l + (r - l) / 2;

			// Sort first and second 
			sort(arr, l, m);
			sort(arr, m + 1, r);

			// Merge the sorted halves
			merge(arr, l, m, r);
		}
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int l = in.nextInt();
		int[] a = new int[l];

		for (int i = 0; i < a.length; i++) {
			a[i] = in.nextInt();
		}
		task4 ob = new task4();
		ob.sort(a, 0, a.length - 1);

		for (int i = 0; i < l; i++) {
			System.out.print(a[i]);
		}

	}
}
