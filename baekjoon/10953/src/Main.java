/* 백준 입출력 - 10953 :: A + B - 6 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			String s = sc.next();
			int A = s.charAt(0) - '0';
			int B = s.charAt(2) - '0';
			
			System.out.println(A + B);
		}
		
		sc.close();
	}
}