package InserSort;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		while (true) {
			System.out.println("Enter input size n");
			int n = sc.nextInt();
			System.out.println("Enter the choice 1:best case 2:avg case 3:worst case 4:to exit");
			int ch = sc.nextInt();

			InsertionSort obj = new InsertionSort();
			obj.input(ch, n);
			//obj.display();

		}
	}
}
