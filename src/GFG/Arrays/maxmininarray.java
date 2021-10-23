package GFG.Arrays;
import java.util.*;
public class maxmininarray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        
        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }

        int max = a[0]; 
        int min = a[0];

        for(int i = 0 ; i < n ; i++){
            if(min > a[i]){
                min = a[i];
            }
            if(max < a[i]){
                max = a[i];
            }
        }

        System.out.println("Min = "+min);
        System.out.println("Max = "+max);

        in.close();
    }
}
