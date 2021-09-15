package Learnings;
import java.util.*;
public class tcs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N=  in.nextInt();
        int V = in.nextInt();
        int count = 0;
        int a[][] = new int [N+1][N+1];
        for(int i = 1 ; i < N+1; i ++){
            for(int r = 1 ; r < N+1; r ++){
                a[i][r] = i*r;
                if(V == a[i][r]){
                    count++;
                }
            }
        }
        if(count > 0){
            System.out.println(count);
        }
        else{System.out.println("NO POWER");}
        in.close();
    }
}
