package MatMul;

import java.util.Scanner;

public class Demo {
	public static void main(String[] args) {
		int m, n, p, q;
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter m,n: ");
		m = sc.nextInt();
		n = sc.nextInt();
		System.out.println("Enter p,q: ");
		p = sc.nextInt();
		q = sc.nextInt();
		int[][] a = new int[m][n];
		int[][] b = new int[p][q];

		System.out.println("Enter Matrix A: ");
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < n; j++) {
				a[i][j] = sc.nextInt();
			}
		}

		System.out.println("Enter Matrix B: ");
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < q; j++) {
				b[i][j] = sc.nextInt();
			}
		}

		int[][] c = new int[m][p];
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				c[i][j] = 0;
				for (int k = 0; k < p; k++) {
					c[i][j] += a[i][k] * b[k][j];
				}
			}
		}

		System.out.println();
		for (int i = 0; i < m; i++) {
			for (int j = 0; j < q; j++) {
				System.out.print(c[i][j] + " ");
			}
			System.out.println();
		}
	}
}
