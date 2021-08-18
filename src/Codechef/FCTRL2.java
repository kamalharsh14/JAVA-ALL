package Codechef;

import java.math.BigInteger;
import java.util.Scanner;

public class FCTRL2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int t = in.nextInt();
        for(int i = 0 ; i < t; i ++){
            int n = in.nextInt();
            System.out.println(factorial(n));
            in.close();
        }
    }
    static BigInteger factorial(int n)
	{
		BigInteger result = BigInteger.ONE;
		for(int i=1;i<=n;i++)
		{
			result = result.multiply(new BigInteger(String.valueOf(i)));
		}
		return result;
	}
}
