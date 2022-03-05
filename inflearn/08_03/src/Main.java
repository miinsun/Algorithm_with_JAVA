import java.util.*;

public class Main {
	static int n, m, score, sum = 0;
	static int max = Integer.MIN_VALUE;
	
	public void DFS(int L, int score, int sum, int[][] arr) {
		if(m < sum) return;
		if(L == n) {
			max = Math.max(max, score);
		}
		else {
			DFS(L + 1, score + arr[L][0], sum + arr[L][1], arr);
			DFS(L + 1, score, sum, arr);
		}
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); //문제 개수
		m = sc.nextInt(); //제한 시간

		int[][] arr = new int [n][2];		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		main.DFS(0, 0, 0, arr);
		System.out.println(max);
		
		sc.close();
		return ;
	}
}
