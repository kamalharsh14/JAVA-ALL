package Regex;
import java.util.*;
import java.util.regex.Pattern;
public class quantifiers {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("'?' Quantifier:");
        System.out.println(Pattern.matches("[xyz]?", "x"));
        System.out.println(Pattern.matches("[xyz]?", "xy"));
        System.out.println(Pattern.matches("[xyz]?", "xyz"));
        System.out.println(Pattern.matches("[xyz]?", "y"));
        System.out.println("'+' Quantifier:");
        System.out.println(Pattern.matches("[xyz]+", "x"));
        System.out.println(Pattern.matches("[xyz]+", "xyzzzz"));
        System.out.println(Pattern.matches("[abc]+", "ayz"));
        System.out.println(Pattern.matches("[abc]+", "abbbccaa"));
        System.out.println("'*' Quantifier:");
        System.out.println(Pattern.matches("[xyz]*", "abc"));
        System.out.println(Pattern.matches("[xyz]*", "x"));
        System.out.println(Pattern.matches("[abc]*", "ayz"));
        System.out.println(Pattern.matches("[abc]*", "abbbccaa"));
        System.out.println(Pattern.matches("[abc]*", ""));
        in.close();
    }
}
