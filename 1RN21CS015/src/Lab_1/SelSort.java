package Lab_1;

import java.util.Random;
import java.util.Scanner;

public class SelSort {
	private int n;
	private int[] a;
	Scanner sc = new Scanner(System.in);

	public void sortArr(int x) {
		System.out.println("Enter n");
		n = sc.nextInt();
		a = new int[n];
		// for best case i.e ascending order
		if (x == 1) {
			for (int i = 0; i < n; i++) {
				a[i] = i + 1;
			}
		}

		// for average case
		else if (x == 2) {
			Random r = new Random();
			for (int i = 0; i < n; i++) {
				a[i] = r.nextInt(n);
			}
		}

		// for worst case i.e descending order
		else {
			for (int i = 0, j = n; i < n; i++, j--) {
				a[i] = j;
			}

		}

		int i, j;
		long start = System.nanoTime();
		for (i = 0; i < n - 1; i++) {
			int min = i;
			for (j = i + 1; j < n; j++) {
				if (a[min] > a[j]) {
					min = j;
				}
			}
			if (i != min) {
				int temp = a[i];
				a[i] = a[min];
				a[min] = temp;
			}
		}
		long stop = System.nanoTime();

		System.out.println(stop - start);
	}

	public void display() {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}

}
