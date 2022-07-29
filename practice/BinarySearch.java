package practice;

import java.io.*;
import java.util.Scanner;

public class BinarySearch {
	public static boolean binary_search(int[] a, int n) {
		int l, r, m;
		l = 0;
		r = a.length-1;
		while (l <= r) {
			m = (l + r) / 2;
			if (a[m] == n) {
				return true;
			} else {
				if (a[m] < n) {
					l = m + 1;
				} else {
					r = m + 1;
				}
			}
		}
		return false;

	}

	public static void main(String[] args) {

		try {
			File f = new File("/Users/arifin/eclipse-workspace/CSE 221/src/practice/binary_search.txt");
			Scanner in = new Scanner(f);
			int a[] = new int[6];
			for (int i = 0; i < a.length; i++) {
				a[i] = in.nextInt();
			}
			System.out.println(binary_search(a, 4));
			
			
		}
		catch (Exception e) {
			

		}

	}

}
