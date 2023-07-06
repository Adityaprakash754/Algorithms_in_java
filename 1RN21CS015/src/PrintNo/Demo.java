package PrintNo;

import java.util.Scanner;

public class Demo {
	private int n;
	Scanner sc = new Scanner(System.in);

	public void printNum() {
		System.out.println("Enter n: ");
		n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
}
