package LinSrch;
import java.util.Random;
import java.util. Scanner;

public class Demo {
    public void timeTest (int[] arr, int n, int key){
        int i;
        long start = System.nanoTime() ;
        for (i = 0; i < n; i++) {
            if (arr[i] == arr[key]) {
                System.out.println("found");
                break;
            }
        }
        long stop = System .nanoTime () ;
        
        if (i == n)
            System.out.println("Not found");

        System.out.println(stop - start);
    }
    public static void main(String[] args) throws Exception {
        int n, key, i, ch;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter n:");
        n = sc.nextInt();

        int[] arr = new int[n];

        Random r = new Random(n) ;
        for (i = 0; i < n; i++) {
            arr[i] = r.nextInt () ;
        }

        Demo obj = new Demo();
        while(true){
            System.out.println("Enter 1:for best case  2:for worst case  3:for avg case");
            ch = sc.nextInt();
            switch(ch){
                case 1:
                    key = 0;
                    obj.timeTest(arr,n,key);
                    break;
                case 2:
                    key = n-1;
                    obj.timeTest(arr,n,key);
                    break;
                case 3:
                    key = n/2;
                    obj.timeTest(arr,n,key);
                    break;
                default:
                    System.out.println("Invalid choice");
                    System.exit(0);
            }
        }

    }
}
