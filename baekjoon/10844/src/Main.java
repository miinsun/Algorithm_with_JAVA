/* 백준 DP - 11057 :: 오르막 수 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[][] dy = new int[n + 1][10];
		
		for(int i = 0; i < 10; i++) {
			dy[1][i] = 1;
		}
		
		for(int i = 2; i <= n; i++) {
			for(int j = 0; j < 10; j++) {
				for(int k = 0; k <= j; k++) {
					dy[i][j] += dy[i - 1][k];
					dy[i][j] = dy[i][j] % 10007;
				}
			}
		}
		
		int total = 0;
		for(int i : dy[n]) {
			total += i;
		}
		
		System.out.println(total % 10007);
		
		sc.close();
	} 
}
