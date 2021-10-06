package Codechef;
import java.util.*;
public class THREEBOX {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int a = in.nextInt();
            int b = in.nextInt();
            int c = in.nextInt();
            int d = in.nextInt();
            int totalbags = 1;
            if((a+b+c) <= d){
                totalbags = 1;
            }
            else if(a+b <= d){
                totalbags = 2;
            }
            else if(a+c <= d){
                totalbags = 2;
            }
            else if(b+c <= d){
                totalbags = 2;
            }
            else{
                totalbags = 3;
            }
            System.out.println(totalbags);
        }
        in.close();
    }
}
