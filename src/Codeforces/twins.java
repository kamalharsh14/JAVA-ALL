package Codeforces;
import java.util.*;
public class twins{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int no_of_coins = in.nextInt();
        int a[] = new int[no_of_coins];
        for(int i = 0 ; i < no_of_coins; i ++){
            a[i] = in.nextInt();
        }
        Arrays.sort(a);
        int sum = 0;
        for(int i = 0 ; i < no_of_coins ; i ++){
            sum = a[i] + sum;
        }
        int add = 0;
        int count = 0;
        int n = no_of_coins - 1;
        sum = sum / 2;
        while(sum >= add){
            add = add + a[n--];
            count++;
        }
        System.out.println(count);
        in.close();
    }
}