/* 백준 그래 - 1260 :: DFS와 BFS */
import java.util.*;
import java.io.*;

public class Main {
	public void DFS(int n, int s, boolean[][] arr, boolean[] check) {
		// DFS는 재귀를 이용해서 풀이
		// 방문한 노드는 check[i] true로 표시
		check[s] = true;
		System.out.print(s + " ");

		for(int i = 1; i <= n; i++) {
			if (!check[i]) {
				if(arr[s][i]) {
					// 스택에 쌓아가듯이 재귀를 쌓아준다.
					DFS(n, i, arr, check);
				}
			}
		}
	}
	
	public void BFS(int n, int s, boolean[][] arr, boolean[] check) {
		// BFS는 queue를 이용해서 풀
		Queue<Integer> q = new LinkedList<>();
		
		// 탐색을 시작할 노드 v부터
		// 방문할 정점을 queue에 담는다.
		for(int i = 1; i <= n; i++) {
			if(arr[s][i]) {
				check[i] = true;
				q.offer(i);
			}
		}
		
		// 방문을 완료하면 check 표시를 해주고
		// 방문한 정점을 출
		check[s] = true;
		System.out.print(s + " ");
		
		while(!q.isEmpty()) {
			// 방문한 정점에서 같은 레벨로 뻗어나간다.
			int tmp = q.poll();
			System.out.print(tmp + " ");
			
			for(int i = 1; i <= n; i++) {
				if(!check[i]) {
					if(arr[tmp][i]) {
						q.offer(i);
						check[i] = true;
					}
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
		int v = Integer.parseInt(st.nextToken());

		boolean[][] arr = new boolean [n + 1][n + 1];
		boolean[] checkDFS = new boolean [n + 1];
		boolean[] checkBFS = new boolean [n + 1];

		for(int i = 0; i < m; i++) {
			st = new StringTokenizer(br.readLine());
			int x = Integer.parseInt(st.nextToken());
			int y = Integer.parseInt(st.nextToken());
			
			// 2,5와 5,2는 같은 정점이기 때문에
			// (x,y) (y,x) 자표를 모두 저장해준다.
			arr[x][y] = true;
			arr[y][x] = true;
		}
		
		
		// DFS
		main.DFS(n, v, arr, checkDFS);
		System.out.println();
    
		// BFS
		main.BFS(n, v, arr, checkBFS);
		
        br.close();
	}
}