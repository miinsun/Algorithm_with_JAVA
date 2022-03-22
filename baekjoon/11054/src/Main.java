/* 백준 DP - 11054 :: 가장 긴 바이토닉 부분 수열 */
import java.util.*;
public class Main {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int ans = 0;
		int n = sc.nextInt();
		int S[] = new int[n];
		int up[] = new int[n];
		int down[] = new int[n];

		for (int i = 0; i < n; i++) {
			S[i] = sc.nextInt();
		}

		// 상승
		for (int i = 0; i < n; i++) {
			int max = 0;
			for (int j = 0; j < i; j++) {
				if (S[j] < S[i]) {
					max = Math.max(max, up[j]);
				}
			}
			up[i] = max + 1;
		}

		// 하강
		for (int i = n-1; i >= 0; i--) {
			int max = 0;
			for (int j = n-1; j > i; j--) {
				if (S[j] < S[i]) {
					max = Math.max(max, down[j]);
				}
			}
			down[i] = max + 1;
		}

		for (int i = 0; i < n; i++) {
			ans = Math.max(ans, up[i]+down[i]);
		}
		
		System.out.println(ans-1);
		
		sc.close();
	}
}
