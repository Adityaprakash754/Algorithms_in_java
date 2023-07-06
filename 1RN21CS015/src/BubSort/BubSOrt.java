package BubSort;

import java.util.Scanner;

public class BubSOrt {
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

		long start = System.nanoTime();
		for (int i = 0; i < n - 1; i++) {
			for (int j = 0; j < n - i - 1; j++) {
				if (a[j] > a[j + 1]) {
					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;
				}
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
