package Learnings;
import java.util.*;

public class MergeSort{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        MergeSort ob = new MergeSort();
        System.out.println("Enter the size of array");
        int n =  in.nextInt();
        int arr[] = new int[n];
        System.out.println("Enter the elements of array");
        for(int i = 0 ; i < n ; i ++){
            arr[i] = in.nextInt();
        }
        ob.sort(arr, 0, n-1);
        ob.print(arr);
        in.close();
    }

    void sort(int arr[], int lb, int ub){
        if(lb < ub){
            int mid = lb + (ub - lb)/2;
            sort(arr, lb, mid);
            sort(arr, mid + 1, ub);

            merge(arr, lb,mid, ub);
        }
    }
    void merge(int [] arr, int s, int m, int e){
        int l1 = m + 1 - s;
        int l2 = e - m;
        int left[] = new int[l1];
        int right[] = new int[l2];

        for(int i = 0 ; i < l1; i ++){
            left[i] = arr[s+i];
        }
        for(int i = 0 ; i < l2; i ++){
            right[i] = arr[m+1+i];
        }
        int i = 0 , j = 0 , k = s;
        while(i < l1 && j < l2){
            if(left[i] <= right[j]){
                arr[k] = left[i++];
            }
            else{
                arr[k] = right[j++];
            }
            k++;
        }
        while(i < l1){
            arr[k++] = left[i++];
        }
        while(j < l2){
            arr[k++] = right[j++];
        }
    }

    void print(int arr[]){
        for(int i = 0 ; i < arr.length; i ++){
            System.out.print(arr[i]+" ");
        }
    }
}