package Codechef;
import java.util.*;
public class TWINGFT {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            int n = in.nextInt();
            int twin = 0;
            int chef = 0;
            int a[] = new int[n];
            for(int j = 0 ; j < n ; j++){
                a[j] = in.nextInt();
            }
            int j = 0;
            while(j < n-1){
                chef = chef + a[j++];
                twin = twin + a[j++];
            }
            twin = twin + a[j];
            System.out.println(Math.max(chef, twin));
        }
        in.close();
    }
}
