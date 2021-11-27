package GFG.Arrays;
import java.util.*;

public class count{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int[n];
        int sum = in.nextInt();

        //inserting values into the array.
        for(int i = 0 ; i < n; i ++){
                a[i] = in.nextInt();
        }

        //creating Hashmap
        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
        int ans = 0;

        for(int i = 0 ; i < n; i ++){
            int diff = sum - a[i];
            if(map.containsKey(diff)){
                ans++;
            }
            map.put(diff,1);
        }
        
        System.out.println(ans);
        in.close();
    }
}