/* 백준 DP - 2579 :: 계단 오르기 */
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n + 1];
		
		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}
		
		int [] dy = new int[n+1];
		if(n >= 1)
			dy[1] = arr[1];
		if (n >= 2) {
			dy[2] = dy[1] + arr[2]; 
		}
		if(n >=3) {
			dy[3] = Math.max(dy[1], dy[2]) + arr[3];
		}
		
		for(int i = 4; i <= n; i++) {
			dy[i] = Math.max(dy[i - 3] + arr[i - 1], dy[i - 2]) + arr[i];
		}
		
		System.out.println(dy[n]);
		sc.close();
	}
}
