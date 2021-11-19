package GFG.Arrays;
import java.util.*;

public class minjumps {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        int arr[] = new int[n];

        //inserting values int the array.
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }
        int count = arr[0];
        int j = 0;
        int steps = 0;
        for(int i = 0 ; i < n ; i ++){
            if(arr[count] >= (n - j)){
                break;
            }
            else{
                count = arr[count];
                j = i + count;
            }
            steps++;
        }

        System.out.println(steps);
        in.close();
    }
}