package Codechef;

import java.util.Scanner;

public class LUCKFOUR {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 1 ; i <= t; i++){
            String num = in.next();
            int count = 0;
            for(int j = 0 ; j < num.length(); j++){
                if(num.charAt(j) == '4'){
                    count++;
                }
            }
            System.out.println(count);
        }
        in.close();
    }
}
