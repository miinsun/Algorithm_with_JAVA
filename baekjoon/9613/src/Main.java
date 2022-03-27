/* 백준 기초 수학  - 9613 :: GCD 합 */
import java.util.*;
public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		
		for(int i = 0; i < t; i++) {
			int n = sc.nextInt();
			int[] arr = new int [n];
			for(int j = 0; j < n; j++) {
				arr[j] = sc.nextInt();
			}

			long total = 0;
			for(int j = 0; j < n - 1; j++) {
				for(int k = j + 1; k < n; k++) {
					total += gcd(arr[j], arr[k]);
				}
			}
			System.out.println(total);
		}
		
		sc.close();
	}
	
	public static int gcd(int a,int b) {
		if(b == 0) return a;
		return gcd(b, a % b);
	}
}
