/* 백준 입출력 - 2588 :: 곱셈 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String s1 = sc.next();
		String s2 = sc.next();
		
		int i3 = Integer.parseInt(s1) * (s2.charAt(2) - '0');
		int i4 = Integer.parseInt(s1) * (s2.charAt(1) - '0');
		int i5 = Integer.parseInt(s1) * (s2.charAt(0) - '0');
		int i6 = Integer.parseInt(s1) * Integer.parseInt(s2);
		
		System.out.println(i3);
		System.out.println(i4);
		System.out.println(i5);
		System.out.println(i6);
		sc.close();
	}
}
