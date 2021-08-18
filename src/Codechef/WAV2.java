package Codechef;
import java.util.*;
public class WAV2 {


   /* public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int a[] = new int[N];
        int Q = in.nextInt();
        int x[] = new int[Q];
        double sum = 1; 
        for(int i = 0 ; i < N ; i ++){
            a[i] = in.nextInt();
        }
        for(int i = 0 ; i < Q ; i ++){
            x[i] = in.nextInt();
            sum = 1;
            for(int j = 0 ; j < N; j++){
                sum = sum * (x[i] - a[j]); 
            }
            if(sum > 0){
                System.out.println("POSITIVE ");
            }
            if(sum < 0){
                System.out.println("NEGATIVE ");
            }
            if(sum == 0){
                System.out.println(0);
            }
        }
        in.close();
    }*/

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        Integer a[] = new Integer[N];
        int Q = in.nextInt();
        int pos = 0;
        for(int i = 0 ; i < N ; i ++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a, Collections.reverseOrder());
        while(Q-- > 0){
            int x = in.nextInt();
            pos = 0;
            int jump = (int)Math.sqrt(N);
            while( pos+jump < N && a[pos+jump] > x){
                pos = pos+jump;
            }
            while(a[pos] > x && pos < N-1){
                pos++;
            }
            if(a[pos] == x){
                System.out.println("0");
            }
            else if(pos % 2 == 0){
                System.out.println("POSITIVE");
            }
            else{
                System.out.println("NEGATIVE");
            }
        }
        in.close();
    }
}
