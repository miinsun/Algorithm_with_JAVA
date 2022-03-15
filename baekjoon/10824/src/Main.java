/* 백준 문자열 처리 - 10824 :: 네 수 */
import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		long answer = 0;
		for(int i = 0; i < 2; i++) {
			String s1 = sc.next();
			String s2 = sc.next();
			
			answer += Long.parseLong(s1 + s2);
		}

		System.out.println(answer);
		sc.close();
	}
}
