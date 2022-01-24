package GFG.JobAThon5;
import java.util.*;

public class question1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int arr[] = new int[n];
        for(int i = 0 ; i < n; i ++){
            arr[i] = in.nextInt();
        }
        int x = in.nextInt();
        int k = in.nextInt();
        int ans = solve(n,arr,x,k);
        System.out.println(ans);
        in.close();
    }

    static int solve(int n , int arr[], int x, int k){
        int energyreq[] = new int[n-1];
        for(int i = 0 ; i < n-1 ; i ++){
            energyreq[i] = Math.abs(arr[i] - arr[i-1]);
        }
        int pos = 0;
        int c = 0;
        while(x >= 0 && k > 0 && c < energyreq.length){
            if(energyreq[c] > x){
                k--;
                pos = ++c;
            }
            else if(x > 0){
                x--;
                pos = ++c;
            }
        }
        return pos;
    }
}
