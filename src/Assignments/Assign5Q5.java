package Assignments;
import java.util.*;
public class Assign5Q5 {

    Scanner sc = new Scanner(System.in);

    String reverseCase(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++) {
            builder.append(convert(string.charAt(i)));
        }
        return builder.toString();
    }

    String read() {
        return sc.nextLine();
    }

    void write(String output) {
        System.out.println(output);
    }

    char convert(char c) {
        return (char) ((c >= 'a' && c <= 'z') ? 'A' + (c - 'a') : 'a' + (c - 'A'));
    }

    public static void main(String[] args) {
        Assign5Q5 caseChange = new Assign5Q5();
        String str = caseChange.read();
        caseChange.write(caseChange.reverseCase(str));
    }

}