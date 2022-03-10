/* 백준 입출력 - 10818 :: 최소, 최대 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int min = Integer.MAX_VALUE;
		int max = Integer.MIN_VALUE;
		
		for(int i = 0; i < n; i++) {
			int tmp = sc.nextInt();
			
			min = Math.min(min, tmp);
			max = Math.max(max, tmp);
		}

		System.out.println(min + " " + max);
		
		sc.close();
	}
}
