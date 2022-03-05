import java.util.*;

public class Main {
	static int n, c, sum = 0;
	static int max = Integer.MIN_VALUE;
	
	public void DFS(int L, int sum, int[] arr) {
		if(c < sum) return;
		if(L == n) {
			max = Math.max(max, sum);
		}
		else {
			DFS(L + 1, sum + arr[L], arr);
			DFS(L + 1, sum, arr);
		}
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		c = sc.nextInt();
		n = sc.nextInt();

		int[] arr = new int [n];		
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		main.DFS(0, 0, arr);
		System.out.println(max);
		
		sc.close();
		return ;
	}
}
