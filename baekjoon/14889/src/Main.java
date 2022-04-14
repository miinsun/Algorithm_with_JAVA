/* 백준 백트래킹 - 14889 :: 스타트와 링크 */
import java.util.*;
import java.io.*;

public class Main {
	static int n;
	static int [][] board;
	static boolean [] check;
	static int min = Integer.MAX_VALUE;
	
	public static void DFS(int now, int level) {
		if(level == n / 2) {
			// 각팀의 점수 구하기
			int start = 0;
			int link = 0;
			
			for(int i = 1; i <= n - 1; i++) {
				for(int j = i + 1; j <= n; j++) {
					if(check[i] == true && check[j] == true) {
						start += board[i][j];
						start += board[j][i];
					}
					else if(check[i] == false && check[j] == false) {
						link += board[i][j];
						link += board[j][i];
					}
				}
			}
			
			min = Math.min(min, Math.abs(start - link));
			return;
		}
		
		for(int i = now + 1; i <= n; i++) {
			if(!check[i]) {
				check[i] = true;
				DFS(i, level + 1);
				check[i] = false;
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader (System.in));
		n = Integer.parseInt(br.readLine());
		board = new int [n + 1][n + 1];
		check = new boolean[n + 1];
		
		// 선수 능력치 입력
		for(int i = 1; i <= n; i++) {
			StringTokenizer st = new StringTokenizer (br.readLine());
			for(int j = 1; j <= n; j++) {
				board[i][j] = Integer.parseInt(st.nextToken());
			}
		}

		DFS(1, 0);
		
		System.out.println(min);
	}
}
