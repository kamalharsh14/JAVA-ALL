package Amazon;

import java.util.*;
public class Array1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        Array1 ob = new Array1();
        ob.convert(num);
        in.close();
    }
    void convert(int num){
        String s = Integer.toString(num);
        String nm = "";
        for(int i = 0 ; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '0'){
                nm = nm + '5';
            }
            else{
                nm = nm +ch;
            }
        }
        System.out.println(nm);
    }
}
