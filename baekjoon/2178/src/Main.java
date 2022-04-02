/* 백준 그래프 - 2178 :: 미로 탑색 - DFS */

import java.util.*;
import java.io.*;

public class Main {
	static int[][] board;
	static int cnt = 1;
	static int min = Integer.MAX_VALUE;
	
	// 인접한 칸(좌우 위 아래) 좌표 정보
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	
	static void DFS(int x, int y, int n, int m) {
		if(x == n - 1 && y == m - 1)
			min = Math.min(min, cnt);
		else {
			for(int i = 0; i < 4; i++) { 
				// 다음에 올 좌표
				int nx = x + dx[i]; 
				int ny = y + dy[i]; 
				
				// 지표 경계 값 검사
				if(nx >= 0 && ny >= 0 && nx < n && ny < m && board[nx][ny] == 1) { 
					cnt++;
					board[nx][ny] = 0;
					DFS(nx, ny, n, m); 
					cnt--;
					board[nx][ny] = 1;
				}
			}
		}
	}
		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		board = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			char[] cList = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				board[i][j] = cList[j] - '0';
			}
		}
		
		DFS(0, 0, n, m);
		System.out.println(min);
		
		br.close();
		return ;
	}
}