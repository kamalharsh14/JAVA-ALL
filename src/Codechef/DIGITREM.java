package Codechef;
import java.util.*;
public class DIGITREM {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int N = in.nextInt();
            int D = in.nextInt();
            int counter = 0;
            while(N > 0){
                boolean check = digitscheck(N,D);
                if(check == true){
                    N++;
                    counter++;
                }
                else{
                    break;
                }
            }
            System.out.println(counter);
        }
        in.close();
    }

    static boolean digitscheck(int n, int m){
        boolean t = false;
        while(n > 0){
            int d = n % 10;
            if(d == m){
                t = true;
            }
            n = n/10;
        }
        return t;
    }
}