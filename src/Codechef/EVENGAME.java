package Codechef;
import java.util.*;
public class EVENGAME {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int p1= 1;
            int p2 = 2;
            int N = in.nextInt();
            int A[] = new int[N];
            int sum = 0;
            for(int j = 0 ; j < N; j ++){
                A[i] = in.nextInt();
                sum = sum + A[i];
            }
            if(sum % 2 == 0){
                System.out.println(p1);
            }
            else{
                System.out.println(p2);
            }
        }
        in.close();
    }
}
