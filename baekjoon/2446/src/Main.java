/* 백준 입출력 - 2446 :: 별찍기 - 9 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 1; i <= n; i++){
			for(int j = 0; j < i - 1; j++) System.out.print(" ");
			for(int j = 0; j < 2 * n - 2 * i + 1; j++) System.out.print("*");
			System.out.println();
			}
		 
		for(int i = 1; i < n; i++){
			for(int j = 0; j < n - i - 1; j++) System.out.print(" ");
			for(int j = 0; j < 2 * i + 1; j++) System.out.print("*");
			System.out.println();
			}
		
		sc.close();
	}
}
