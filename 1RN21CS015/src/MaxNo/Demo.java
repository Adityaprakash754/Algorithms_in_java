package MaxNo;

import java.util.Scanner;

public class Demo {
	Scanner sc = new Scanner(System.in);
	private int n, maxNo, i;
	private int[] arr;

	public void maxNum() {
		System.out.println("Enter n:");
		n = sc.nextInt();

		arr = new int[n];

		System.out.println("Enter array:");
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		maxNo = arr[0];

		for (i = 1; i < n; i++) {
			if (arr[i] > maxNo)
				maxNo = arr[i];
		}

		System.out.println("Max element is: " + maxNo);
	}

}
