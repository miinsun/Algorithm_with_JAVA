import java.util.*;

public class Main {
	static Integer[] coins;
	static int n, m;
	static int min = Integer.MAX_VALUE;
	
	public void DFS(int L, int sum) {
		if(sum > m) return;
		if(L >= min) return;
		if(sum == m) {
			min = Math.min(min, L);
		}
		else {
			for(int i = 0; i < n; i++) {
				DFS(L + 1, sum + coins[i]);
			}
		}
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // 동전의 종류
		coins = new Integer[n];
		for(int i = 0; i < n; i++) 
			coins[i] = sc.nextInt();
		Arrays.sort(coins, Collections.reverseOrder());
		m = sc.nextInt(); // 거슬러 줄 금액
		
		main.DFS(0, 0);
		System.out.println(min);
		sc.close();
		return ;
	}
}
