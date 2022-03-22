/* 백준 DP - 1912 :: 연속 */
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		int[] dy = new int[n];
		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		dy[0] = arr[0];
		for(int i = 1; i < n; i++) {
			dy[i] = Math.max(arr[i], dy[i-1] + arr[i]);
		}
		
		
		int answer = -1001;
		for(int i : dy) {
			answer = Math.max(i, answer);
		}
		
		System.out.println(answer);
		sc.close();
	}
}
