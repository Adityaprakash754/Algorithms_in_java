package Lab_2;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the choice 1:best case 2:avg case 3:worst case ");
		int ch = sc.nextInt();

		MergeSort obj = new MergeSort();
		obj.sortArr(ch);
		obj.display();

		sc.close();
	}

}
