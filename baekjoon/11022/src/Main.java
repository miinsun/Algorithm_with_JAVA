/* 백준 입출력 - 11022 :: A + B - 8 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int A = sc.nextInt();
			int B = sc.nextInt();
			
			System.out.println("Case #" + (i + 1) + ": " 
			+ A + " + " + B + " = " + (A + B));
		}
		
		sc.close();
	}
}
