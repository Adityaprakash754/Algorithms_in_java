package Lab_7;

import java.util.Scanner;
public class Dijkastra {
	private int n,src;
	private int [] dist;
	private int [][] adj;
	Scanner sc = new Scanner(System.in);
	public void input() {
		System.out.println("Enter the no of vertices: ");
		n = sc.nextInt();
		
		adj = new int [n][n];
		dist = new int[n];
		
		System.out.println("Enter adj matrix: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				adj [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the source vertex: ");
		src = sc.nextInt();

		for(int i = 0; i < n; i++) {
			dist [i] = adj[src][i];
		}
		
		
	}
}
