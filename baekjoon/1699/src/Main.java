/* 백준 DP - 2133 :: 타일 채우기 */
import java.util.*;
public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int [] dy = new int[n+1];

		if(n > 1) {
			dy[2] = 3;
		
			for(int i = 4; i <= n; i += 2) {
				if((i / 2) % 2 == 1)
					dy[i] = dy[i - 2] * dy[2];
				else
					dy[i] = dy[i / 2] * dy[i / 2];
			}
		}
		
		System.out.println(dy[n]);
		sc.close();
	}
}
