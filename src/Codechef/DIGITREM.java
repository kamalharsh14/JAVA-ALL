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
            int n = N;
            int c = 0;
            int d = 0;
            while(n > 0){
                d = n%10;
                n = n/10;
                c++;

                if(d == D){
                    n = (int) (n*Math.pow(10, c) + (d+1)*Math.pow(10, c-1));
                    counter = n - N;
                    c = 0;
                }
                
            }
            System.out.println(counter);
        }
        in.close();
    }


    //Time Limit Exceeded
    /* public static void main(String[] args) {
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
    } */
}