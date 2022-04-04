/* 백준 그래프 - 2146 :: 다리 만들기 */

import java.util.*;
import java.io.*;

class Point { 
	public int x, y, cnt; 
	Point (int x, int y, int cnt){ 
		this.x = x; 
		this.y = y; 
		this.cnt = cnt;
	} 
}
	
public class Main {
	static int[][] board, map;
	static int n;
	// 인접한 칸(좌우 위 아래) 좌표 정보
	static int[] dx = {-1, 0, 1, 0}; 
	static int[] dy = {0, -1, 0, 1};

		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		n = Integer.parseInt(st.nextToken());
		board = new int[n][n];
		map = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			for(int j = 0; j < n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		
		Queue<Point> q = new LinkedList<>();
		int order = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				// 각각의 섬 방
				if(board[i][j] == 1) {
					q.offer(new Point(i, j, 0));
					board[i][j] = 0;
					// 섬을 방문 할때마다 섬의 순서 증가
					order++;
					map[i][j] = order;

					while(!q.isEmpty()) { 
						Point tmp = q.poll(); 
						for(int k = 0; k < 4; k++) { 
							int nx = tmp.x + dx[k]; 
							int ny = tmp.y + dy[k]; 
							
							// 경계선 검사 
							if(nx >= 0 && nx <= n - 1 && ny >= 0 && ny <= n - 1 && board[nx][ny] == 1) {
								board[nx][ny] = 0; 
								q.offer(new Point(nx, ny, 0));
								map[nx][ny] = order; 
							}
						}
						
					}
				}	
			}
		}
		
	    int answer = Integer.MAX_VALUE;
		for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (map[i][j] >= 1) {
                    boolean[][] check = new boolean[n][n];
                    Queue<Point> queue = new LinkedList<Point>();
                    queue.offer(new Point(i, j, 0));
                    check[i][j] = true;
                    
                    while (!queue.isEmpty()) {
                        Point point = queue.poll();
                        for (int k = 0; k < 4; k++) {
                            int nx = point.x + dx[k];
                            int ny = point.y + dy[k];
                            if (nx >= 0 && nx < n && ny >= 0 && ny < n && !check[nx][ny] && map[nx][ny] != map[i][j]) {
                                check[nx][ny] = true;
                                if (map[nx][ny] == 0) { //바다
                                    queue.offer(new Point(nx, ny, point.cnt + 1));
                                } else { //다른 섬
                                    answer = Math.min(answer, point.cnt);
                                }
                            }
                        }
                    }
                }
            }
        }
		
		System.out.println(answer);
		
		br.close();
		return ;
	}
}