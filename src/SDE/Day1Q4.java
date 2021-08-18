package SDE;
import java.util.*;
public class Day1Q4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = in.nextInt();
        }
        int sum = 0;
        int max = a[0];
        for(int i = 0 ; i < n ; i ++){
            sum = sum + a[i];
            if(max < sum){
                max = sum;
            }
            if(sum < 0){
                sum = 0;
            }
        }
        System.out.println("Sum of Maximum Subarray = "+max);
        in.close();
    }
}
