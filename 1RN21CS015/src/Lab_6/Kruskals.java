package Lab_6;

import java.util.Arrays;
import java.util.Scanner;
public class Kruskals {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of vertices: ");
        int n = sc.nextInt();

        int [][] adj = new int [n][n];
        System.out.println("Enter adj Matrix: ");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                adj [i][j] = sc.nextInt();
            }
        }

        Edge [] edges = new Edge[(n*(n-1))/2];
        int k = 0;
        for(int i = 0; i < n; i++){
            for(int j = i+1; j < n; j++){
                edges[k] = new Edge(i, j, adj[i][j]);
                k++;
            }
        }

        sort(edges);

        int []parent = new int[n];
        Arrays.fill(parent,-1);

        int minCost = 0;
        System.out.println("Edges: ");
        for(int i = 0; i < k; i++){
            int lsrc = find(parent, edges[i].src);
            int ldest = find(parent,edges[i].dest);

            if(lsrc != ldest){
                System.out.println((edges[i].src + 1)+"<->"+(edges[i].dest + 1));
                minCost += edges[i].weight;
                union(parent,lsrc,ldest);
            }
        }

        System.out.println();
        System.out.println("Minimum Cost Spanning Tree: "+minCost);

        sc.close();

    }

    static void sort(Edge []edges){
        for(int i = 1; i < edges.length; i++){
            for(int j = 0; j < edges.length - i; j++){
                if(edges[j].weight > edges[j+1].weight){
                    Edge temp = edges[j];
                    edges[j] = edges[j+1];
                    edges[j+1] = temp;
                }
            }
        }
    }

    static int find(int [] parent, int i){
        if(parent[i] == -1)
            return i;
        
        return find(parent,parent[i]);
    }

    static void union(int[] parent, int lsrc, int ldest){
        parent[lsrc] = ldest;
    }
}
