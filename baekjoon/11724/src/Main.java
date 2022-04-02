/* 백준 그래프 - 11724 :: 연결 요소의 개수 */
import java.util.*;
import java.io.*;

public class Main {
	public void DFS(int n, int s, boolean[][] arr, int[] check, int order) {
		//체크가 안되있을 경우에만 order를 담아준다.
		if(check[s] == 0)
			check[s] = order;

		for(int i = 1; i <= n; i++) {
			if (check[i] == 0) {
				if(arr[s][i]) {
					DFS(n, i, arr, check, order);
				}
			}
		}
	}

	public static void main(String[] args) throws IOException{
		Main main = new Main();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());

		boolean[][] arr = new boolean [n + 1][n + 1];
		int[] check = new int [n + 1];

		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			// 방향 없는 그래프는 
			// (x,y) (y,x) 좌표를 모두 저장해준다.
			arr[x][y] = true;
			arr[y][x] = true;
		}
		
		// DFS
		int order = 1;
		for(int i = 1; i <= n; i++) {
			// 방문한 적이 없을 경우에만
			// 정점을 방문한다.
			if(check[i] == 0) {
				main.DFS(n, i, arr, check, order);
				order++;
			}
		}
		
		// check배열에서 가장 큰 값이 연결요소의 값이다.
		int answer = 0;
		for(int i : check)
			answer = Math.max(i, answer);
		
		System.out.println(answer);
        br.close();
	}
}