package GFG.Arrays;
import java.util.*;

public class minheights {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int k = in.nextInt();
        int n = in.nextInt();

        int arr[] = new int[n];

        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        //inserting values int the array & finding min/maxs.
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
            if(min > arr[i]){
                min = arr[i];
            }
            if(max < arr[i]){
                max = arr[i];
            }
        }
        int diff = 0;
        if((max - k) > 0){
            if(min+k < max-k){
                diff = (max - k) - (min + k);
                System.out.println("min: "+(min+k));
                System.out.println("max: "+(max-k));
                System.out.println("if(min+k < max-k):"+diff);
            }
    
            if(min+k > max-k){
                diff = (max + k) - (min + k);
                System.out.println("min: "+(min+k));
                System.out.println("max: "+(max+k));
                System.out.println("if(min+k > max-k) so we do (min+k && max+k)");
            }
        }
        else{
            diff = (max + k) - (min + k);
        }

        System.out.println(diff);

        in.close();
    }
}
