package Regex;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class matcher {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Pattern pattern = Pattern.compile(".ars.");
        String st = in.nextLine();
        Matcher matcher = pattern.matcher(st);
        System.out.println("The pattern ars is present: "+matcher.matches());
        in.close();
    }
}
