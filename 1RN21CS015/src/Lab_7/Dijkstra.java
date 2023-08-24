package Lab_7;

import java.util.Scanner;
public class Dijkstra {
	private int n,src;
	private int [] dist;
	private int [][] adj;
    	private boolean [] visited;
	Scanner sc = new Scanner(System.in);
	public void input() {
		System.out.println("Enter the no of vertices: ");
		n = sc.nextInt();
		
		adj = new int [n][n];
		dist = new int[n];
        	visited = new boolean[n];
		
		System.out.println("Enter adj matrix: ");
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				adj [i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Enter the source vertex: ");
		src = sc.nextInt();

        	dijkstra();
	}

    public void dijkstra(){
        int minDist, unvis = -1;
        for(int i = 0; i < n; i++) {
		dist [i] = adj[src - 1][i];
		
		visited[i] = false;
	}

        visited[src - 1] = true;

        for(int i = 1; i < n; i++){
            minDist = Integer.MAX_VALUE;
            for(int j = 0; j < n; j++){
                if(!visited[j] && dist[j] < minDist){
                    unvis = j;
                    minDist = dist[j];
                } 
            }

            visited[unvis] = true;

            for(int vertex = 0; vertex < n; vertex++){
                if(!visited[vertex] && dist[unvis] + adj[unvis][vertex] < dist[vertex]){
                    dist[vertex] =  dist[unvis] + adj[unvis][vertex];
                }
            }
        }
    }

    public void display(){
        for(int i = 0; i < n; i++){
            if((src - 1) == i)
                continue;
            
            System.out.println("Shortest dist from "+src+" to "+(i+1)+" is "+dist[i]);
        }
    }
}
