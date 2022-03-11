/* 백준 입출력 - 10991 :: 별찍기 - 16 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n - i - 1; j++) System.out.print(" ");
			for(int j = 1; j <= 2 * i + 1; j++) {
				if(j % 2 == 1) System.out.print("*");
				else System.out.print(" ");
			}
			System.out.println();
		}
		sc.close();
	}
}
