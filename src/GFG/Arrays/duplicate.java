package GFG.Arrays;
import java.util.*;

public class duplicate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        //inserting values int the array.
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }
    }
}