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
        int target = in.nextInt();
        int pos = -1;
        for(int i = 0 ; i < size; i ++){
            if(target == array[i]){
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