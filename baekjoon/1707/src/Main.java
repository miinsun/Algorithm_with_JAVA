/* 백준 그래프 - 1707 :: 이분 그래프 */
import java.util.*;
import java.io.*;

public class Main {
	static String answer = "YES";
	
	public void DFS(int n, int s, int prev, boolean[][] arr, boolean[] check) {
		check[s] = true;

		for(int i = 1; i <= n; i++) {
			if(!check[i]) {
				if(arr[s][i]) {
					DFS(n, i, s, arr, check);
				}
			}
			else if(check[i] && prev != i)
				answer = "NO";
		}
	}

	public static void main(String[] args) throws IOException{
		Main main = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int t = Integer.parseInt(st.nextToken());
		for(int i = 0; i < t; i++) {
			st = new StringTokenizer(br.readLine());
			int n = Integer.parseInt(st.nextToken());
			int m = Integer.parseInt(st.nextToken());

			boolean[][] arr = new boolean [n + 1][n + 1];
			boolean[] check = new boolean [n + 1];

			for(int j = 0; j < m; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				// 방향 없는 그래프는 
				// (x,y) (y,x) 좌표를 모두 저장해준다.
				arr[x][y] = true;
				arr[y][x] = true;
			}
			
			main.DFS(n, 1, 1, arr, check);
			System.out.println(answer);
		}
		
        br.close();
	}
}