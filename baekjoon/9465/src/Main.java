/* 백준 DP - 9465 :: 스티커 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) { 
			// 입력
			int n = sc.nextInt();
			int[][] arr = new int[2][n + 1];
			for(int j = 0; j < 2; j++) {
				for(int k = 1; k <= n; k++) {
					arr[j][k] = sc.nextInt();
				}
			}
			
			int[][] dy = new int[2][n + 1];
			dy[0][1] = arr[0][1];
			dy[1][1] = arr[1][1];
			
			for(int j = 2; j <= n; j++) {
				dy[0][j] = Math.max(dy[1][j -1], dy[1][j - 2]) + arr[0][j];
				dy[1][j] = Math.max(dy[0][j -1], dy[0][j - 2]) + arr[1][j];
			}
			
			System.out.println(Math.max(dy[0][n], dy[1][n]));
		}
		sc.close();
	}
}
