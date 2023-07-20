package Toh;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		while (true) {
			System.out.println("Enter the no of disks or enter -1 to exit ");
			int n = sc.nextInt();

			if (n == -1)
				System.exit(0);
			else {
				Toh_prob obj = new Toh_prob();
				long start = System.nanoTime();
				obj.toh(n, 'a', 'b', 'c');
				long stop = System.nanoTime();
				System.out.println(stop - start);
			}
		}
	}

}
