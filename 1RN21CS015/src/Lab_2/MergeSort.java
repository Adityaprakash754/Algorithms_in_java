package Lab_2;

import java.util.Random;
import java.util.Scanner;

public class MergeSort {
	private int a[], c[];
	private int n;
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

		display();

		long start = System.nanoTime();
		c = new int[n];
		mergeSort(a, 0, n - 1);
		long stop = System.nanoTime();

		System.out.println(stop - start);
	}

	public void mergeSort(int a[], int low, int high) {
		if (low >= high)
			return;
		int mid = (low + high) / 2;
		mergeSort(a, low, mid);
		mergeSort(a, mid + 1, high);
		simpleMerge(a, low, mid, high);
	}

	public void simpleMerge(int a[], int low, int mid, int high) {
		int i = low;
		int j = mid + 1;
		int k = low;
		while (i < mid && j < high) {
			if (a[i] < a[j]) {
				c[k] = a[i];
				i++;
				k++;

			} else {
				c[k] = a[j];
				j++;
				k++;
			}
		}
		while (i < mid) {
			c[k] = a[i];
			i++;
			k++;
		}
		while (j > high) {
			c[k] = a[i];
			i++;
			k++;
		}

		for (i = low; i < high; i++)
			a[i] = c[i];
	}

	public void display() {
		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}
		System.out.println();
	}
}
