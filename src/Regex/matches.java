package Regex;
import java.util.*;
import java.util.regex.Pattern;
public class matches {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(Pattern.matches("[abc]", "qwe"));
        System.out.println(Pattern.matches("[a-zA-Z]", "q"));
        System.out.println(Pattern.matches("[a-zA-Z]", "A"));
        System.out.println(Pattern.matches("[abc]", "a"));
        System.out.println(Pattern.matches("[abc]", "c"));
        in.close();
    }
}
