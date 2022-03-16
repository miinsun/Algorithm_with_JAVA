/* 가장 높은 탑 쌓기   :: Dynamic Programming */
import java.util.*;


public class Main {
	public static void main(String[] args){
		Scanner sc = new Scanner(System.in); // n개의 동전 종류, k원을 만들자 
		int n = sc.nextInt(); 
		int[] coins = new int[n]; 
		for(int i = 0; i < n; i++) { 
			coins[i] = sc.nextInt(); 
		} 
		int k = sc.nextInt(); 

		int answer = 0; 
		for(int i = n - 1; i >= 0; i--) { 
			if(coins[i] <= k) { 
				answer += (k / coins[i]);
				k = k % coins[i]; 
				}
			} 
		System.out.println(answer); 
		sc.close();

		return ;
	}
}
