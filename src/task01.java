
public class task01 {
	public static int[] bubble_Sorting(int[] a, int n) {
		if (n == 1)
			return a;

		for (int j = 0; j < n - 1; j++) { // take one for loop for the whole iteration to reduce complexity

			if (a[j] > a[j + 1]) {
				int temp = a[j];
				a[j] = a[j + 1];
				a[j + 1] = temp;
			}
		}

		return bubble_Sorting(a, n-1);
	}

	public static void main(String[] args) {
		int a[] = { 20, 30, 10 };
		a = bubble_Sorting(a, a.length);

	}
}
