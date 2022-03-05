import java.util.*;

class Point {
	public int x, y;
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int[][] board, dis;
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
		
	public void BFS(int x, int y) {
		Queue<Point> Q = new LinkedList<>();
		Q.offer(new Point(x, y));
		board[x][y] = 1;
		
		while(!Q.isEmpty()) {
			Point tmp = Q.poll();
			for(int i = 0; i < 4; i++) {
				int nx = tmp.x + dx[i];
				int ny = tmp.y + dy[i];
				
				// 경계선 검사
				if(nx >= 0 && nx <=6 && ny >= 0 && ny <= 6 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					Q.offer(new Point(nx, ny));
					dis[nx][ny] = dis[tmp.x][tmp.y] + 1;
				}
			}
		}
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		board = new int[7][7];
		dis = new int[7][7];
		
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				board[i][j] = sc.nextInt();
			}
		}
	
		main.BFS(0, 0);
		if(dis[6][6] == 0) System.out.println(-1);
		else System.out.println(dis[6][6]);
		
		sc.close();
		return ;
	}
}
