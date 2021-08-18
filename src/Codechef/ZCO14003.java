package Codechef;
import java.util.*;
class ZCO14003{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long budget[] = new long[n];
		for(int i=0;i<n;i++){
		    budget[i]=sc.nextLong();
		}
		Arrays.sort(budget);
		long revenue= budget[0]*n;
		for(int i=1;i<n;i++){
		   long maxprofit = budget[i]*(n-i);
		   if(maxprofit>revenue){
		       revenue = maxprofit;
		   }
		}
		System.out.print(revenue);
        sc.close();
    }
}