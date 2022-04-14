/* 백준 동적 계획법 1 - 1003 :: 피보나치 함수 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			// dy[n][0, 1], 피보나치 n을 호출했을때, 0과 1의 수
			int[][] dy = new int[n + 1][2];
			
			if(n >= 0)
				dy[0][0] = 1;
			if(n >= 1)
				dy[1][1] = 1;
			
			for(int j = 2; j <= n; j++) {
				// 0 호출 계산
				dy[j][0] += (dy[j-1][0] + dy[j-2][0]);
				// 1 호출 계산
				dy[j][1] += (dy[j-1][1] + dy[j-2][1]);
			}
			
			System.out.println(dy[n][0] + " " + dy[n][1]);
		}
		
		sc.close();
	} 
}
