package Codechef;
import java.util.*;
class CHFGCD{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        CHFGCD ob = new CHFGCD();
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i++){
            int x = in.nextInt();
            int y = in.nextInt();
            int count = 0;
            if( x % 2 == 0 && y % 2 == 0){
                count = 0;
                break;
            }
            if(ob.gcd(x+1, y) > 1 || ob.gcd(x, y+1) > 1){
                count = 1;
            }
            else{
                count = 2;
            }
            System.out.println(count);
        }
        in.close();
    }

    public int gcd(int a, int b)
    {
        // Everything divides 0
        if (a == 0)
          return b;
        if (b == 0)
          return a;
      
        // base case
        if (a == b)
            return a;
      
        // a is greater
        if (a > b)
            return gcd(a-b, b);
        return gcd(a, b-a);
    }
}