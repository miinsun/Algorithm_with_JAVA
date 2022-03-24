/* 백준 DP - 2225 :: 합분해 */
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		
		int [][] dy = new int[201][201];
		
		for(int i = 1; i <= k; i++)
			dy[i][0] = 1;
		
		for(int i = 1; i <= k; i++) {
			for(int j = 1; j <= n; j++) {
				dy[i][j] = (dy[i][j-1] + dy[i-1][j]) % 1000000000;
			}
		}
		
		System.out.println(dy[k][n]);
		sc.close();
	}
}
