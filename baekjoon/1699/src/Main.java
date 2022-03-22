/* 백준 DP - 1699 :: 제곱수의 합 */
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] dy = new int[1000001];

		for(int i = 1; i <= n; i++) {
			dy[i] = i;
			for(int j = 1; j * j <= i; j++) {
				if(dy[i] > dy[i - j * j] + 1)
					dy[i] = dy[i - j * j] + 1;
			}
		}
		
		System.out.println(dy[n]);
		sc.close();
	}
}
