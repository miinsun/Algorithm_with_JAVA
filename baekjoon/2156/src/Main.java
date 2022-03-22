/* 백준 DP - 2156 :: 포도주 시식 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int [] arr = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			arr[i] = sc.nextInt();
		}

		int [] dy = new int[n+1];
		if(n >= 1)
			dy[1] = arr[1];
		if (n >= 2) {
			dy[2] = dy[1] + arr[2]; 
		}
		
		for(int i = 3; i <= n; i++) {
			dy[i] = Math.max(dy[i-1], Math.max(dy[i-2] + arr[i], dy[i-3] + arr[i-1] + arr[i]));
		}
		
		System.out.println(dy[n]);
		sc.close();
	}
}
