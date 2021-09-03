package HackerRank;

import java.io.*;
import java.util.stream.*;

class Result9 {

    /*
     * Complete the 'findDigits' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int findDigits(int n) {
    // Write your code here
        int c = n; int d = 0;
        while(c > 0){
            d++;
            c = c / 10;
        }
        int count = 0;
        int a[] = new int[d];
        c = n;
        int k = 0;
        while(c > 0){
            a[k++] = c % 10;
            c = c / 10;
        }
        for(int i = 0 ; i < d ; i ++){
            if(a[i] != 0){
                if(n % a[i] == 0){
                    count++;
                }
            }
        }
        return count;
    }

}

public class fd {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int t = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, t).forEach(tItr -> {
            try {
                int n = Integer.parseInt(bufferedReader.readLine().trim());

                int result = Result9.findDigits(n);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
