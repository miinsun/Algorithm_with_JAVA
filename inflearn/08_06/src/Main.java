import java.util.*;

public class Main {
	static int[] pm, ch, arr;
	static int n, m;
	
	public void DFS(int L) {
		if(L == m) {
			for(int x: pm) System.out.print(x+" ");
			System.out.println();
		}
		else {
			for(int i = 0; i < n; i++) {
				if(ch[i] == 0) {
					ch[i] = 1;
					pm[L] = arr[i];
					DFS(L + 1);
					ch[i] = 0;
				}
			}
		}
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt(); 
		m = sc.nextInt();
		arr = new int[n];
		
		for(int i = 0; i < n; i++) arr[i] = sc.nextInt();
		
		ch = new int [n];
		pm = new int [m];
				
		main.DFS(0);
		sc.close();
		return ;
	}
}
