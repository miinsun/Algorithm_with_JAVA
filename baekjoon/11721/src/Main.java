/* 백준 입출력 - 11721 ::열 개씩 끊어 출력하 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.next();
		
		int len = s.length();
		System.out.print(s.charAt(0));
		for(int i = 1; i < len; i++) {
			if(i % 10 == 0)
				System.out.println();
			System.out.print(s.charAt(i));
		}		
		sc.close();
	}
}
