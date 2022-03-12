/* 백준 DP - 9095 :: 1, 2, 3 더하기 */
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] dy = new int[12];
		
		dy[1] = 1; 
        dy[2] = 2;
        dy[3] = 4;
        
    	for(int i = 4; i <= 11; i++) {
    		dy[i] = dy[i - 1] + dy[i - 2] + dy[i - 3];
    	}
    	
    	for(int i = 0; i < n; i++) {
    		int tmp = sc.nextInt();
    		System.out.println(dy[tmp]);
		}
    	
		sc.close();
	} 
}
