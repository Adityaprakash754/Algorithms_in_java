package InsertSort;

import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
	private int a[];
	private int n;
	Scanner sc = new Scanner(System.in);

	public void input(int x, int n) {
		this.n = n;
		a = new int[n];

		switch (x) {
		case 1:
			// for best case i.e ascending order
			for (int i = 0; i < n; i++) {
				a[i] = i + 1;
			}
			break;

		case 2:
			// for average case
			Random r = new Random();
			for (int i = 0; i < n; i++) {
				a[i] = r.nextInt(n);
			}
			break;
		case 3:
			// for worst case i.e descending order
			for (int i = 0, j = n; i < n; i++, j--) {
				a[i] = j;
			}
			break;
		default:
			System.exit(0);
		}

		// display();

		long start = System.nanoTime();
		quickSort(a, 0, n - 1);
		long stop = System.nanoTime();

		System.out.println(stop - start);

	}

	public void insertionSort(int [] a){
		for(int i = 0;i < n;i++) {
			int v = a[i];
			j
		}
	}
}
