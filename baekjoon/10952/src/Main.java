/* 백준 입출력 - 10952 :: A + B - 5 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		while(A != 0 && B != 00) {
			System.out.println(A + B);
			A = sc.nextInt();
			B = sc.nextInt();
		}
		
		sc.close();
	}
}
