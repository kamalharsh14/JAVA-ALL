package Codechef;

import java.util.Scanner;

public class VACCINQ {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int n = in.nextInt();
            int p = in.nextInt();
            int x = in.nextInt();
            int y = in.nextInt();
            int a[] = new int[n];
            for(int j = 0 ; j < n ; j ++){
                a[j] = in.nextInt();
            }
            int child = 0 ; int adult = 0;
            for(int j = 0 ; j < p ; j ++){
                if(a[j] == 0){
                    child ++;
                }
                else{
                    adult++;
                }
            }
            int time = child*x + adult*y;
            System.out.println(time);
        }
        in.close();
    }
}
