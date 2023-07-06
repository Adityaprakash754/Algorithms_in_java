package PattMatch;

import java.util.Scanner;

public class Demo {
	private int n, m;
	private String a;
	private String b;
	Scanner sc = new Scanner(System.in);

	public int patMat() {
		System.out.println("Enter n,m");
		n = sc.nextInt();
		m = sc.nextInt();

		System.out.println("Enter String a");
		a = sc.next();
		System.out.println("Enter String b");
		b = sc.next();

		int i, j;

		for (i = 0; i < n - 1; i++) {
			j = 0;
			while (j < m && a.charAt(i + j) == b.charAt(j)) {
				j++;
			}
			if (j == m) {
				return i;
			}
		}
		return -1;

	}

}
