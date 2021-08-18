package Codechef;
import java.util.*;
public class HTMLTAGS {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            String s = in.next();
            String ans = "Success";
            int len = s.length();
            if(len <= 3){
                ans = "Error";
            }
            else if(s.charAt(0) != '<' || s.charAt(1) != '/'){
                ans = "Error";
            }
            else if(s.charAt(len-1) != '>'){
                ans ="Error";
            }
            else{
                for(int j = 2 ; j < len - 1; j++){
                    if(Character.isLowerCase(s.charAt(j)) == false){
                        if(Character.isDigit(s.charAt(j)) == true){
                            ans = "Success";
                        }
                        else{
                        ans = "Error";
                        }
                    }
                }
            }
            System.out.println(ans);
        }
            in.close();
    }
}
