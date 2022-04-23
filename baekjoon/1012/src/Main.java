/* 백준 DFS와 BFS - 1012 :: 유기농 배추 */

import java.io.*;
import java.util.*;

public class Main {
	static int[][] field;
	static int M, N, K;
	
	// 상하좌우 좌표
	static int[] dx = {0, 1, 0, -1};
	static int[] dy = {-1, 0, 1, 0};
	
	public static void dfs(int y, int x, int n) {
		// 탐색한 배추는 지렁이의 수로 표기
		field[y][x] = n;
		
		// 탑색한 배추를 기준으로 다시 상하좌우에 탐색전인 배추를 찾아 깊이 탐색
		for(int i = 0; i < 4; i++) {
			int nY = y + dy[i];
			int nX = x + dx[i];
			
			if(0 <= nX && 0 <= nY && nX < M && nY < N)
				if(field[nY][nX] == -1)
					dfs(nY, nX, n);
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < T; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());

			M = Integer.parseInt(st.nextToken());	// 밭의 가로길이
			N = Integer.parseInt(st.nextToken());	// 밭의 세로길이
			K = Integer.parseInt(st.nextToken());	// 배추가 심어진 위치
			
			field = new int[N][M];
			
			// 배추밭 정보 입력
			for(int j = 0; j < K; j++) {
				st = new StringTokenizer(br.readLine());
				int x = Integer.parseInt(st.nextToken());
				int y = Integer.parseInt(st.nextToken());
				
				// 아직 검사 전인 배추밭을 -1로 표현
				field[y][x] = -1;
			}			
			
			int n = 0;	// 배추흰지렁이 수
			
			// 밭을 탑색하며 아직 검사 전인 배추밭에서 깊이탑색을 해줌
			for(int j = 0; j < N; j++) {
				for(int k = 0; k < M; k++) {
					if(field[j][k] == -1) {
						dfs(j, k, n++);	// 탐색을 할때마다 지렁이의 수가 늘어남
					}
				}
			}
			
			System.out.println(n);
		}
		
		
		br.close();
	}
}
