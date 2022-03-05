import java.util.*;

public class Main {
	static int[] pm;
	static int n, m;
	public void DFS(int L) {
		if(L == m) {
			for(int i = 0; i < m; i++) {
				System.out.print(pm[i] + " ");
			}
			System.out.println();
		}
		else {
			for(int i = 1; i <= n; i++) {
				pm[L] = i;
				DFS(L + 1);
			}
		}
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); // ¹øÈ£
		m = sc.nextInt(); // »ÌÀ» °¹¼ö
		
		pm = new int[m];
		main.DFS(0);
		
		sc.close();
		return ;
	}
}
