package Lab_4;

import java.util.Scanner;
public class GreedyKnapSack {
    private int []w;
    private int []p;
    private int []ind;
    private double []x;
    private int n,weight;
    private double maxProfit;
    Scanner sc = new Scanner(System.in);
    public void input(){
        System.out.println("Enter the no. of items and max weight: ");
        n = sc.nextInt();
        weight = sc.nextInt();

        ind = new int [n];
        w = new int [n];
        p = new int [n];
        System.out.println("Enter the profit and weight for each item: ");
        for(int i = 0; i < n; i++){
            p[i] = sc.nextInt();
            w[i] = sc.nextInt();

            ind[i] = i;
        }

        for(int i = 0; i < n - 1; i++){
            for(int j = 0; j < n - i - 1; j++){
                if((double)p[j]/(double)w[j] < (double)p[j+1]/(double)w[j+1]){
                    int temp1 = p[j];
                    p[j] = p[j+1];
                    p[j+1] = temp1;

                    int temp2 = w[j];
                    w[j] = w[j+1];
                    w[j+1] = temp2;

                    int temp = ind[j];
                    ind[j] = ind[j+1];
                    ind[j+1] = temp;
                }
            }
        }
        knapSack();
    }

    public void knapSack(){
        maxProfit = 0;
        x = new double [n];
        for(int i = 0; i < n; i++)
            x[i] = 0.0;

        double u = weight;
        int i;
        for(i = 0; i < n; i++){
            if(w[i] > u)
                break;
            
            x[i] = 1.0;
            u = u - w[i];
            maxProfit += p[i];
        }

        if(i < n){  
            x[i] = u /(double) w[i];

            maxProfit += p[i]*x[i];
        }
    }

    public void display(){   
        int count = 0; 
        System.out.println("Solution Vector: ");
        for(int i = 0; i < n; i++,count++){
            int j;
            for(j = 0; j < n; j++){
                if (ind [j] == count)
                    break;
            }
            System.out.print(x[j]+" ");
            System.out.println();
        }
        System.out.println("Maximum Profit: "+maxProfit);
    }
}
