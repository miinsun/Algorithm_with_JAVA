/* 백준 그래프 - 2667 :: 단지번호붙이기 */
import java.io.*;
import java.util.*;

public class Main {
	static int [][] board;
	static int[] check;
	static int n;

	// 앞 뒤 양옆 좌표 정보 
	static int[] dx = {1, 0, -1, 0}; 
	static int[] dy = {0, 1, 0, -1};

	static void DFS(int x, int y, int order) {
		check[order]++;
		board[x][y] = 0;
	
		for(int i = 0; i < 4; i++) { 
			// 다음에 올 좌표
			int nx = x + dx[i]; 
			int ny = y + dy[i]; 
			
			// 지표 경계 값 검사 and 단지 확인
			if(nx >= 0 && ny >= 0 && nx < n && ny < n && board[nx][ny] == 1) { 
				DFS(nx, ny, order); 
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		
		// 지도 정보 입력
		n = Integer.parseInt(br.readLine());
		board = new int [n][n];
		check = new int [n * n];
		for(int i = 0; i < n; i++) {
			char[] c = br.readLine().toCharArray();
			for(int j = 0; j < n; j++) {
				board[i][j] = c[j] - '0';
			}
		}
		
		// DFS를 이용해 단지 번호 붙이기
		int order = 0;
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				if(board[i][j] == 1) {
					order++;
					DFS(i, j, order);
				}
			}
		}
				
		// 출력
		sb.append(order).append('\n');
		
		// 단지 수 오름차순 정렬
		int[] tmp = new int[order];
		for(int i = 1; i <= order; i++) {
			tmp[i - 1] = check[i];
		}
		Arrays.sort(tmp);
		
		for(int i: tmp) {
			sb.append(i).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
