package Learnings;
import java.util.*;
public class Arraylist {
    public static void main(String[] args) {
        ArrayList<ArrayList<String>> ar = new ArrayList<>();
        ArrayList<String> br = new ArrayList<>();
        ArrayList<String> cr = new ArrayList<>();
        ArrayList<String> dr = new ArrayList<>();
        br.add("Cake");
        br.add("Pizza");
        br.add("Bread");
        cr.add("Milk");
        cr.add("Butter");
        cr.add("Cheese");
        dr.add("Noodles");
        dr.add("Manchurian");
        dr.add("Sauce");
        ar.add(br);
        ar.add(cr);
        ar.add(dr);
        System.out.println(ar);
    }    
}
