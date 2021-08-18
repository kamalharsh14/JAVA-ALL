package Codechef;

import java.util.Scanner;

public class TSORT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        int a[] = new int[t];
        for(int i = 0; i < t; i++){
            a[i] = in.nextInt();
        }
        for(int i = 0 ; i < t; i++){
            for(int j = 0 ; j< t ; j++){
                if(a[i] < a[j]){
                    int temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        for(int i = 0 ; i < t; i++){
            System.out.println(a[i]);
        }
        in.close();
    }
}
