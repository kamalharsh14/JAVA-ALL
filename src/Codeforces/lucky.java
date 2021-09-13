package Codeforces;

import java.util.Scanner;

public class lucky {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String c = "";
        int count = 0;
        String a = Integer.toString(n);
        for(int i = 0 ; i < a.length(); i ++){
            if(a.charAt(i) == '4' || a.charAt(i) == '7'){
                count++;
            }
            if(count == a.length()){
                c = "YES";
            }
            else if(n % 4 == 0 || n % 7 == 0){
                c = "YES";
            }
            else if(n % 47 == 0){
                c = "YES";
            }
            else{
                c = "NO";
            }
        }
        
        System.out.println(c);
        in.close();
    }
}
