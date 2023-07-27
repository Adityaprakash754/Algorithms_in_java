package Lab_5;

import java.util.Scanner;

public class Prims {
	private int n;
	private int srcVertex;
	private int[][] costMatrix;
	private boolean[] visited;

	Scanner sc = new Scanner(System.in);

	public void input() {
		System.out.println("Enter the no of vertices: ");
		n = sc.nextInt();
		costMatrix = new int[n][n];
		visited = new boolean[n];

		System.out.println("Enter the cost Adjacency Matrix: ");
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < n; j++) {
				costMatrix[i][j] = sc.nextInt();
			}
		}

		prims();
	}

	public void prims() {
		for (int i = 0; i < n; i++)
			visited[i] = false;

		System.out.println("Enter the source vertex: ");
		srcVertex = sc.nextInt();

// srcVertex -1 because we are giving input from 1
		visited[srcVertex - 1] = true;

		int source = 0, target = 0, cost = 0;

		for (int i = 1; i < n; i++) {
			int min = Integer.MAX_VALUE;

			for (int j = 0; j < n; j++) {
				if (visited[j]) {
					for (int k = 0; k < n; k++) {
						if (!visited[k] && min > costMatrix[j][k]) {
							min = costMatrix[j][k];
							source = j;
							target = k;
						}
					}
				}
			}
			visited[target] = true;
			System.out.print("(" + (source + 1) + "," + (target + 1) + ")");
			cost += min;
		}
		System.out.println();
		System.out.println("Min cost of spanning tree: " + cost);
	}
}
