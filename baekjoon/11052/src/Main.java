/* 백준 DP - 11052 :: 카드 구매하기 */
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] arr = new int [n + 1];
		
		for(int i = 1; i <= n; i++)
			arr[i] = sc.nextInt();
		
		int [] dy = new int[n + 1];
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				dy[i] = Math.max(dy[i], arr[j] + dy[i - j]);
			}
		}
		
		System.out.println(dy[n]);
		sc.close();
	}
}
