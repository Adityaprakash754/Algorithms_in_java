package SelSort;

import java.util.Scanner;

public class SelSort {
	private int n;
	private int[] a;
	Scanner sc = new Scanner(System.in);

	public void sortArr() {
		System.out.println("Enter n");
		n = sc.nextInt();
		a = new int[n];
		System.out.println("Enter arr");
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
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
