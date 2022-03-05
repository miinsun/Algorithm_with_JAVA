import java.util.*;

public class Main {
	static int[][] board = new int[7][7];
	static int[] dx = {-1, 0, 1, 0};
	static int[] dy = {0, 1, 0, -1};
	static int len = 0;
	static int min = Integer.MAX_VALUE;
	
	public void DFS(int cx, int cy) {
		if(cx == 6 && cy == 6) min = Math.min(min, len);
		else {
			for(int i = 0; i < 4; i++) {
				int nx =  cx + dx[i];
				int ny = cy + dy[i];
				
				//갈 수 있는 경계선 지정
				if(nx >= 0 && nx <= 6 && ny >= 0 && ny <= 6 && board[nx][ny] == 0) {
					board[nx][ny] = 1;
					len++;
					DFS(nx, ny);
					len--;
					board[nx][ny] = 0;
				}
			}
		}
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				board[i][j] = sc.nextInt();
			}
		}
		
		board[0][0] = 1;
		main.DFS(0, 0);
		System.out.println(min);
		sc.close();
		return ;
	}
}
