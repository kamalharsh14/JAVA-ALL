package Assignments;
import java.util.*;
public class Quiz1Q1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int ar[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
            ar[a[i]] = i;
        }
        for(int i = 0 ; i < n ; i ++){
            System.out.print(ar[i]+" ");
        }
        in.close();
    }    
}
