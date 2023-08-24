package Lab_8;

import java.util.Scanner;

public class Floyd {
	private int n;
	private int[][] adj;
	Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.println("Enter the no of nodes: ");
		n = sc.nextInt();

		adj = new int[n][n];

		System.out.println("Enter adj matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				adj[i][j] = sc.nextInt();
			}
		}

		floyd();
	}

	public void floyd() {
		for (int k = 0; k < n; k++) {
			for (int i = 0; i < n; i++) {
				for (int j = 0; j < n; j++) {
					adj[i][j] = Math.min(adj[i][j], adj[i][k] + adj[k][j]);
				}
			}
		}
	}

	public void display() {
		System.out.println("The matrix is: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				System.out.print(adj[i][j] + " ");
			}
			System.out.println();
		}
	}
}
