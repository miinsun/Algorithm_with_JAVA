/* 백준 브루트 포스 - 2231 :: 분해 */
import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		int answer = 0;
		for(int i = 0; i <= n; i++) {
			int total = i;
			int tmp = i;
			
			while(true) {
				if(tmp / 10 == 0) {
					total += tmp % 10;
					break;
				}
				
				total += tmp % 10;
				tmp /= 10;
			}
			
			if(total == n) {
				answer = i;
				break;
			}
		}
		
		System.out.println(answer);
			
		sc.close();
	}
}
