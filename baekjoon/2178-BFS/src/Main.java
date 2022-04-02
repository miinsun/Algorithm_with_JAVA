/* 백준 그래프 - 2178 :: 미로 탑색 - BFS*/

import java.util.*;
import java.io.*;

class Point { 
	public int x, y; 
	Point (int x, int y){ 
		this.x = x; 
		this.y = y; 
	} 
}
	
public class Main {
	static int[][] board, dis;
	static int n, m;
	// 인접한 칸(좌우 위 아래) 좌표 정보
	static int[] dx = {-1, 0, 1, 0}; 
	static int[] dy = {0, 1, 0, -1};

	static public void BFS(int x, int y) { 
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y)); 
		board[x][y] = 1; 
		
		while(!Q.isEmpty()) { 
			Point tmp = Q.poll(); 
			for(int i = 0; i < 4; i++) { 
				int nx = tmp.x + dx[i]; 
				int ny = tmp.y + dy[i]; 
				
				// 경계선 검사 
				if(nx >= 0 && nx <= n - 1 && ny >= 0 && ny <= m - 1 && board[nx][ny] == 1) {
					board[nx][ny] = 0; 
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1; 
				}
			}
		}
	}

		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());
		board = new int[n][m];
		dis = new int[n][m];
		
		for(int i = 0; i < n; i++) {
			char[] cList = br.readLine().toCharArray();
			for(int j = 0; j < m; j++) {
				board[i][j] = cList[j] - '0';
			}
		}
		
		BFS(0, 0);
		System.out.println(dis[n-1][m-1] + 1);
		
		br.close();
		return ;
	}
}