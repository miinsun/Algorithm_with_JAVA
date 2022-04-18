/* 백준 분할 정복 - 11444 :: 피보나치 수 6 */

import java.util.*;
import java.io.*;

public class Main {
	static int mod = 1000000007;
	public static long Fibo(long n) {
		if(n == 0)
			return 0;
		if(n == 1)
			return 1;
		
		return Fibo(n - 1) % mod + Fibo(n - 2) % mod;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
		long n = Long.parseLong(br.readLine());
		
		System.out.println(Fibo(n) % mod);
		br.close();
	}
}