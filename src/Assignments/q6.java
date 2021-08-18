package Assignments;

import java.util.*;

class colon
{
    public String seperateleft(String str){
        String nm = new String();
        for(int i = 0 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ':'){
                return nm;
            }
            else{
                nm = nm+ch;
            }
        }
        return null;
    }
    public String seperateright(String str, int in){
        String nm = new String();
        for(int i = in+1 ; i < str.length(); i++){
            char ch = str.charAt(i);
            if(ch == ' '){
                return nm;
            }
            else{
                nm = nm+ch;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = in.nextLine();
        colon ob = new colon();
        s = s+" ";
        int index = 0;
        for(int i = 0 ; i < s.length(); i++){
                char ch = s.charAt(i);
                if(ch == ':'){
                    index = i;
                }
            }
        String st = ob.seperateleft(s);
        String str = ob.seperateright(s, index);
        if( st == null){
            System.out.println("\nN");
        }
        if( st.length() > str.length()){
            System.out.println("\nL");
        }
        if( st.length() < str.length()){
            System.out.println("\nR");
        }
        if( st.length() == str.length()){
            if(st.compareTo(str) != 0){
            System.out.println("\nD");
            }
            else{
            System.out.println("\nS");
            }
        }
        in.close();
    }
}