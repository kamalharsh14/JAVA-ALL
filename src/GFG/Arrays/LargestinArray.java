package GFG.Arrays;

import java.util.Scanner;

public class LargestinArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        }
        int max = -1;
        for(int i = 0 ; i < n ; i ++){
            if(max < a[i]){
                max = a[i];
            }
        }
        System.out.println(max);
        in.close();
    }
}
