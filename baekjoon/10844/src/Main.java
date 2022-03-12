/* 백준 DP - 10844 :: 쉬운 계단 수 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dy = new int[12];
		
		dy[0] = 0;
		dy[1] = 9; 
        
		for(int i = 2; i <= n; i++) {
			dy[i] = (2 * dy[i - 1] - 1);
		}
		
		System.out.println(dy[n]);
    	
		sc.close();
	} 
}
