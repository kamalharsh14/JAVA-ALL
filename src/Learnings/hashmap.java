package Learnings;

import java.util.*;

public class hashmap {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        HashMap<String, Integer> hm = new HashMap<String, Integer>();
        System.out.print("Enter Key = 'stop' to terminate\n");
        for(int i = 1 ; i > 0 ; i ++){
            System.out.print("Enter Key: ");
            String s = in.next();
            if(s.equals("stop")){
                break;
            }
            System.out.print("\nEnter Value: " );
            int n = in.nextInt();
            hm.put(s, n);
        }
        System.out.println("HashMap: "+hm);
        System.out.println("HashMap Keys: "+hm.keySet());
        System.out.println("HashMap Values: "+hm.values());
        in.close();
    }
}
