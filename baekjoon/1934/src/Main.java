/* 백준 기초 수학  - 1934 :: 최소공배수 */
import java.util.*;

public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for(int i = 0; i < n; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			int max = 0;

			for(int j = 1; j <= Math.min(a, b); j++) {
				if(a % j == 0 && b % j == 0) {
					max = j;
				}
			}
			System.out.println(a * b /max);
		}
		
		sc.close();
	}
}
