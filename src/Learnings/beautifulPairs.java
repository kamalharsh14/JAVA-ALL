package Learnings;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class beautifulPairs {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        int M = in.nextInt();
        List<Integer> A = new ArrayList<>();
        List<Integer> B = new ArrayList<>();
        for(int i = 0 ; i < N; i ++){
            int k = in.nextInt();
            A.add(k);
        }
        for(int i = 0 ; i < M; i ++){
            int k = in.nextInt();
            B.add(k);
        }
        beautifulPairs ob = new beautifulPairs();
        int count = ob.getCount(N, M, A, B);
        System.out.println(count);
        in.close();
    }

    public int getCount(int N, int M, List<Integer> A, List<Integer> B){
        int count = 1;
        List<Integer> S1 = new ArrayList<>();
        List<Integer> S2 = new ArrayList<>();
        Collections.sort(A);
        Collections.sort(B);
        for(int i = 0 ; i < N; i ++){
            S1.add(A.get(i));
            S2.add(B.get(i));
            count = count(S1, S2, count);
        }
        return count;
    }

    public int count(List<Integer> A, List<Integer> B, int count){
        int N = A.size();
        int M = B.size();
        for(int i=0, j=0; i < N && j < M; i++, j++)
        {        
            while(j<N && A.get(i) != B.get(i)){            
                if(A.get(i)>B.get(i))
                j++;
                while(i<N && A.get(i) < B.get(i))
                i++;
            }
            if(A.get(i)==B.get(i))
                count++;
        }
        return count;
    }
}
