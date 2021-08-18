package Codechef;
import java.util.*;
public class MINNOTES {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int n = in.nextInt();
            int a[] = new int[n];
            for(int j = 0 ; j < n ; j ++){
                a[j] = in.nextInt();
            }
            int sum = 0;
            int max = a[0];
            int min = a[0];
            for(int j = 0 ; j < n ; j ++){
                if(max < a[j]){
                    max = a[j];
                }
                if(min > a[j]){
                    min = a[j];
                }
            }
            for(int j = 0 ; j < n ; j ++){
                if(max == a[j]){
                    a[j] = min;
                    break;
                }
            }
            for(int j = 0 ; j < n ; j ++){
                sum = sum + (a[j]/min);
            }
            System.out.println(sum);
        }
        in.close();
    }
}
