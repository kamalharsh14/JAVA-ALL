//WAP to apply Linear Search in an Array.

package Learnings;

import java.util.*;
public class ArrayImplementation{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter Size of array");
        int size = in.nextInt();         //size input
        int array[] = new int[size];     //defining an array

        System.out.println("Enter elements of array");
        for(int i = 0 ; i < size ; i++){
            array[i] = in.nextInt();     //inserting values into the array
        }

        System.out.println("Enter target element");
        int target = in.nextInt();         //target input

        // 1 3 4 7 (2) 7 8 9 10  target = 6
        // 0 1 2 3  4  5 6 7 8   size = 9
        int pos = -1;
        for(int i = 0 ; i < size; i ++){
            if(target == array[i]){
                pos = i;  //pos = -1
                break;
            }
        }
        if(pos == -1){
            System.out.println("Element not found!");
        }
        else{
            System.out.println("Position of "+target+" = "+(pos+1));
        }
        in.close();
    }
}