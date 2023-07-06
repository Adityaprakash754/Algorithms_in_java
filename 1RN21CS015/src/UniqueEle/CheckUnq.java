package UniqueEle;

import java.util.Scanner;

public class CheckUnq {
	private int n;
	private int[] arr;
	Scanner sc = new Scanner(System.in);

	public boolean check() {
		System.out.println("Enter n: ");
		n = sc.nextInt();

		arr = new int[n];

		System.out.println("Enter array: ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					return false;
				}
			}
		}

		return true;
	}
}
