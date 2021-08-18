package Codechef;
import java.util.*;
public class LAPIN {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t ; i ++){
            String s = in.next();
            int len = s.length();
            String fh = "", sh = "";
            if(len % 2 == 0){
                fh = s.substring(0, (len/2));
                sh = s.substring((len/2),len);
                fh = sortString(fh);
                sh = sortString(sh);
                if(fh.equals(sh)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }
            else{
                fh = s.substring(0, (len/2));
                sh = s.substring((len/2)+1,len);
                fh = sortString(fh);
                sh = sortString(sh);
                if(fh.equals(sh)){
                    System.out.println("YES");
                }
                else{
                    System.out.println("NO");
                }
            }            
        }
        in.close();
    }
    public static String sortString(String inputString)
    {
        char tempArray[] = inputString.toCharArray();
        Arrays.sort(tempArray);
        return new String(tempArray);
    }
}
