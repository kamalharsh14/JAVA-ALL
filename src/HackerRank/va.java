package HackerRank;

import java.io.*;


class Result10 {

    /*
     * Complete the 'viralAdvertising' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER n as parameter.
     */

    public static int viralAdvertising(int n) {
    // Write your code here
        int s = 5;
        int l = 0;
        int cum_likes = 0;
        for(int i = 0 ; i < n ; i++){
            l = s/2;
            s = l*3;
            cum_likes = cum_likes + l;
        }
        return cum_likes;
    }

}

public class va {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        int result = Result10.viralAdvertising(n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
