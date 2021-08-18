package Codechef;

import java.util.*;

public class VISA {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for (int j = 0; j < t; j++) {
            int x1 = in.nextInt();
            int x2 = in.nextInt();
            int y1 = in.nextInt();
            int y2 = in.nextInt();
            int z1 = in.nextInt();
            int z2 = in.nextInt();
            int counter =0;
            if( x2 >= x1 ){
                counter ++;
            }
            if( y2 >= y1){
                counter++;
            }
            if(z2 <= z1){
                counter ++;
            }
            if(counter == 3){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
        in.close();
    }
}