package Codechef;
import java.util.*;
public class SQALPAT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int c = 1;
        int a[][] = new int[N][5];
        for(int i = 0; i < N ; i ++){
            for(int j = 0 ; j < 5 ; j ++){
                a[i][j] = c;
                c++;
            }
        }
        for(int i = 0; i < N ; i ++){
            if(i % 2 != 0){
                for(int j = 4 ; j >= 0 ; j --){
                    System.out.print(a[i][j]+" ");
                }
            }
            else{
                for(int j = 0 ; j < 5 ; j++){
                    System.out.print(a[i][j]+" ");
                }
            }
            System.out.println();
        }
        in.close();
    }
}
