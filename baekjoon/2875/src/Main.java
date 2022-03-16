/* 백준 그리디 - 2875 :: 대회 or 인턴 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// n:여자, m:남자, k:인
		int n = sc.nextInt();
		int m = sc.nextInt();
		int k = sc.nextInt();
		int answer = 0;
		
		while (n >= 2 && m >= 1 && n + m - 3 >= k) {
			n -= 2;
			m--;
			answer++;
		}
		
		System.out.println(answer);
		sc.close();
	}
}
