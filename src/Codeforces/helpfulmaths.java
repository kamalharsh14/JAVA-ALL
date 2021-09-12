package Codeforces;

import java.util.Arrays;
import java.util.Scanner;

public class helpfulmaths {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String n = in.next();
        String s = "";
        for(int i= 0 ; i < n.length(); i ++){
            if(n.charAt(i) != '+'){
                s = s+ n.charAt(i);
            }
        }
        int a[] = new int[s.length()];
        for(int i = 0 ; i < s.length(); i ++){
            a[i] = Character.getNumericValue(s.charAt(i));
        }
        Arrays.sort(a);
        String ss = "";
        for(int i = 0 ; i < s.length(); i ++){
            if(i != s.length()-1){
                ss = ss + a[i] + "+";
            }
            else{
                ss = ss + a[i];
            }
        }
            System.out.print(ss+" ");
        in.close();
    }
    
}
