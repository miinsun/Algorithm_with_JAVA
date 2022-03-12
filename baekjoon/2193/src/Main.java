/* 백준 DP - 2193 :: 이친수 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		long [] dy = new long[n + 1];
		
		dy[0] = 0;
		dy[1] = 1; 
		
		for(int i = 2; i <= n; i++) 
		{ 
			dy[i] = dy[i - 2] + dy[i - 1]; 
		} 

		System.out.println(dy[n]);
		sc.close();
	}
}
