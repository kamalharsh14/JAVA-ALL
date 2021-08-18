package Codechef;

import java.util.*;

class QUIZPLAG {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int i = 0; i < t; i++) {
            boolean flag = true;
            int n = in.nextInt();
            int m = in.nextInt();
            int k = in.nextInt();
            int a[] = new int[k];
            int b[] = new int[n + m + 1];
            for (int j = 0; j < k; j++) {
                a[j] = in.nextInt();
            }
            for (int j = 0; j < k; j++) {
                b[a[j]]++;
            }
            for (int j = 1; j <= n; j++) {
                if (b[j] > 1) {
                    System.out.print(a[j - 2] + " ");
                    flag = false;
                }
            }
            if(flag == true){
                System.out.println(0);
            }
            System.out.println();
        }
        in.close();
    }
}