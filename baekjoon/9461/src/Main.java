/* 백준 DP - 9461 :: 파도반 수열 */
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();

		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			long [] dy = new long[n + 1];
			dy[1] = 1;
			
			if(n > 1) {
				dy[2] = 1;
				for(int j = 3; j <= n; j++) {
					dy[j] = dy[j - 3] + dy[j - 2];
				}
			}
			System.out.println(dy[n]);
		}
		
		sc.close();
	}
}
