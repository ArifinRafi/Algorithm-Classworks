package practice;

public class MergeSort {
	public static void merge(int[] a, int l, int r, int mid) {
		int x = (mid-l)+1;
		int y = (r-mid);
		int []n = new int[x];
		int []m = new int[y];
		
		for (int i = 0; i<x; i++) {
			n[i] = a[i];
		}

		for (int i = 0; i<y; i++) {
			n[i] = a[mid+1];
		}
		int i = 0;	
		int j = 0;
		int k = 0;
		
		while(i<=x && j<=y) {
			if(n[i]<m[j]) {
				a[k++] = n[i];
			}
			else {
			a[k++] = m[j];
		}
			for(; i<=x;i++) {
				a[k++]=n[i];
			}
			for(; j<=y;j++) {
				a[k++]=m[j];
			}
		}
		
		

	}

	public static void Sort(int []a, int l, int r) {
		while(l<=r) {
			int mid = (l+r)/2;
			Sort(a, l, mid);
			Sort(a, mid+1, r);
			merge(a, l, r, mid);
		}
		
	}
	public static void main(String[] args) {
		int []a= {10,53,5,3,1};
		 Sort(a, 0, a.length-1);
		for (int i = 0; i<a.length;i++) {
			System.out.println(a[i]);
		}
	}

}
