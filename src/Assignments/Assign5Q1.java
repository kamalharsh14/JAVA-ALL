package Assignments;
import java.util.*;
public class Assign5Q1 {
    int min(String s1 , String s2){
        return s1.compareTo(s2);

    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Assign5Q1 ob = new Assign5Q1();
        System.out.print("\nEnter String 1:");
        String str1 = in.nextLine();
        System.out.print("Enter String 1:");
        String str2 = in.nextLine();
        int i = ob.min(str1 , str2);
        System.out.println();
        if(i == 0){
            System.out.println("Both are same!");
        }
        if(i < 0){
            System.out.println(str2+" is greater then "+str1+"!");
        }
        if(i > 0){
            System.out.println(str1+" is greater than "+str2+"!");
        }
        in.close();
    }
}
