/* 백준 DP - 10844 :: 오르막 수 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		// dy[계단 수][현재 계단]
		long[][] dy = new long[n + 1][10];
		
		for(int i = 1; i < 10; i++) {
			dy[1][i] = 1;
		}
		
		// 두번쩨 자릿수부터 탐색
		for(int i = 2; i <= n; i++) {
			// i번째 자릿수의 가릿값들을 탐색 (0 ~ 9)
			for(int j = 0; j < 10; j++) {
				//	ㅓ=0, 자릿값이 0이면, 이전 자릿수의 첫번쨔 자릿수만 가능
				if(j == 0)
					dy[i][j] = dy[i - 1][1] % 1000000000;
				else if(j == 9)
					dy[i][j] = dy[i - 1][8] % 1000000000;
				else
					dy[i][j] = (dy[i - 1][j + 1] + dy[i - 1][j - 1]) % 1000000000;
			}
		}
		
		long total = 0;
		for(int i = 0; i < 10; i++)
			total += dy[n][i];
		
		System.out.println(total % 1000000000);
		
		sc.close();
	} 
}
