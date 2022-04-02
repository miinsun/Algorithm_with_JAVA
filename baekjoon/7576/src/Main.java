/* 백준 그래프 - 7576 :: 토마토 */

import java.util.*;

class Point {
	public int x, y;
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int[][] box, dis;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int n, m;
	static Queue<Point> Q = new LinkedList<>();
	
	public void BFS() {				
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				if(nx >= 0 && nx < n && ny >= 0 && ny < m && box[nx][ny] == 0) {
					box[nx][ny] = 1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);
		
		m = sc.nextInt();
		n = sc.nextInt();
		box = new int[n][m];
		dis = new int[n][m];
		
		// 초기화
		// 익혀있는 토마토 인식
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				box[i][j] = sc.nextInt();
				if(box[i][j] == 1) Q.offer(new Point(i, j));
			}
		}
	
		// 넓이 탐색 실행
		main.BFS();
		
		// 안익은 토마토 찾기
		// 안익은 토마토가 있으면 false
		boolean flag = true;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(box[i][j] == 0) flag = false;
			}
		}
		
		//가장 오래 걸린 날 찾기
		int answer = Integer.MIN_VALUE;
		if(flag) {
			for(int i = 0; i < n; i++) {
				for(int j = 0; j < m; j++) {
					answer = Math.max(answer, dis[i][j]);
				}
			}
			System.out.println(answer);
		}
		else System.out.println(-1);
		
		sc.close();
		return ;
	}
}