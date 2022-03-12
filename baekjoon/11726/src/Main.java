/* 백준 DP - 11726 :: 2xn 타일링 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dy = new int[n + 2];
		
		dy[0] = 1;
		dy[1] = 1;
		dy[2] = 2;
		
		for(int i = 3; i <= n; i++) {
			dy[i] = (dy[i - 1] + dy[i - 2]) % 10007;
			
		}
		
		System.out.println(dy[n]);
		sc.close();
	}
}
