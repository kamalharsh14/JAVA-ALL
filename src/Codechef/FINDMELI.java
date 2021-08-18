package Codechef;
import java.util.*;
public class FINDMELI {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int K = in.nextInt();
        int c = -1;
        int a[] = new int[N];
        for(int i = 0 ; i < N ; i ++){
            a[i] = in.nextInt();
            if(K == a[i]){
                c = 1;
                break;
            }
            else{
                c = -1;
            }
        }
        System.out.println(c);
        in.close();
    }
}
