package Learnings;
import java.util.*;
public class ArraylistArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        /* int n = in.nextInt();
        int a[] = new int[n];
        for(int i = 0 ; i < n ; i ++){
            a[i] = in.nextInt();
        } */
        List<int []> arr = new ArrayList<>(); 
        arr.add(new int[]{2, 3});
        System.out.println(arr);
        in.close();
    }
}
