package Learnings;

import java.util.Scanner;

public class random2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int b[] = new int[n];
        for(int i = 0 ; i < n ; i++){
            a[i] = in.nextInt();
        }
        for(int i = 0 ; i < n ; i++){
            int c = a[i];
            int pro = 1;
            while(c > 0){
                int d = c % 10;
                pro = pro * d;
                c = c / 10;
            }
            b[i] = pro;
        }
        int counter = 0;
        for(int i = 0 ; i < n ; i++){
            for(int j = 0 ; j < n ; j++){
                if(i != j){
                    if(b[i] == b[j]){
                        counter = counter +1;
                    }
                }
            }
        }
        System.out.println(counter);
        in.close();
    }
}
