package Codechef;
import java.util.*;
public class ANDSUBAR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        while(t-- > 0){
            int odd = 0;
            int even = 0;
            int n = in.nextInt();
            for(int i = 1 ; i <= n ; i ++){
                if(i % 2 == 0){
                    odd++;
                }
                else{
                    even++;
                }
            }
            if(odd == even){
                System.out.println(2*odd);
            }
            else{
                System.out.println(2*Math.min(odd, even));
            }
        }
        in.close();
    }
}
