package Codeforces;
import java.util.*;
public class arrivalofgeneral {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int a[] = new int [n];
        for (int i=0; i<n; i++) a[i] = in.nextInt();

     int min,max,min_index,max_index;

     min=a[0];
     min_index=0;
     max=a[0];
     max_index=0;

     for (int i=0; i<n; i++)
     {
         if ( min>=a[i])
         {
             min=a[i];
             min_index=i;
         }
         if ( max<a[i])
         {
             max=a[i];
             max_index=i;
         }

     }

     if ( min_index<max_index)
     {

          min_index=(n-1)-min_index;
          System.out.println((min_index+max_index-1));
     }
     else
     {

      min_index=(n-1)-min_index;
      System.out.println((min_index+max_index));
     }
     in.close();
    }
}
