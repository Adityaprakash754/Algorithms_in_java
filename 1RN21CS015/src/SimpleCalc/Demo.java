package SimpleCalc;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a, b, res = 0;
		char c;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter a: ");
		a = sc.nextInt();
		System.out.println("Enter b: ");
		b = sc.nextInt();
		System.out.println("Enter operator: ");
		c = sc.next().charAt(0);

		switch (c) {
		case '+':
			res = a + b;
			break;
		case '-':
			res = a - b;
			break;
		case '*':
			res = a * b;
			break;
		case '/':
			res = a / b;
			break;
		default:
			System.out.println("invalid operator");
			break;

		}

		System.out.println("result: " + res);
	}

}
