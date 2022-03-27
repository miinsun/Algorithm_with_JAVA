/* 백준 기초 수학  - 1850 :: 최대공약수 */
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		
		long a = sc.nextLong();
		long b = sc.nextLong();
		long max = gcd(a, b);

		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < max; i++)
			sb.append(1);
		
		System.out.println(sb);
		
		sc.close();
	}
	
	public static long gcd(long a,long b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}
