package LinSer;

import java.util.Random;
import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int n, key, i;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter n:");
		n = sc.nextInt();

		int[] arr = new int[n];

		Random r = new Random();
		for (i = 0; i < n; i++) {
			arr[i] = r.nextInt(10);
		}

		System.out.println("Enter key:");
		key = sc.nextInt();

		long start = System.nanoTime();
		for (i = 0; i < n; i++) {
			if (arr[i] == key) {
				System.out.println("found");
				break;
			}
		}
		if (i == n)
			System.out.println("found");

		long stop = System.nanoTime();

		System.out.println(stop - start);

	}
}
