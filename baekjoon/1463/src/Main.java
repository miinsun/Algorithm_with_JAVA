/* 백준 DP - 1463 :: 1로 만들 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dy = new int[n + 1];
		
		for(int i = 2; i <= n; i++) {
			dy[i] = dy[i - 1] + 1;
			
			if(i % 6 == 0) {
				dy[i] = Math.min(dy[i / 3] + 1, Math.min(dy[i / 2] + 1, dy[i]));
			}
			else if(i % 3 == 0) {
				dy[i] = Math.min(dy[i / 3] + 1, dy[i]);
			}
			else if(i % 2 == 0) {
				dy[i] = Math.min(dy[i / 2] + 1, dy[i]);
			}
		}
		
		System.out.println(dy[n]);
		sc.close();
	}
}
