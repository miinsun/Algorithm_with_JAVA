/* 백준 그래프 - 4963 :: 섬의 개수 */
import java.io.*;
import java.util.*;

public class Main {

	// 앞 뒤 양옆 좌표 정보 
	static int[] dx = {0, 1, 1, 1, 0, -1, -1, -1}; 
	static int[] dy = {1, 1, 0, -1, -1, -1, 0, 1};

	static void DFS(int x, int y, int h, int w, int[][] map) {
		map[x][y] = 0;
	
		for(int i = 0; i < 8; i++) { 
			// 다음에 올 좌표
			int nx = x + dx[i]; 
			int ny = y + dy[i]; 
			
			// 지표 경계 값 검사 and 단지 확인
			if(nx >= 0 && ny >= 0 && nx < h && ny < w && map[nx][ny] == 1) { 
				DFS(nx, ny, h, w, map); 
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
	
		while(true) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int w = Integer.parseInt(st.nextToken());
			int h = Integer.parseInt(st.nextToken());
			
			// w,h가 0이면 종료
			if(w == 0 && h == 0)
				break;
			
			// 맵 정보 입력
			int[][] map = new int[h][w];
			for(int i = 0; i < h; i++) {
				st = new StringTokenizer(br.readLine());
				for(int j = 0; j < w; j++) {
					map[i][j] = Integer.parseInt(st.nextToken());
				}
			}
			
			// 땅일때만 DFS진입
			int cnt = 0;
			for(int i = 0; i < h; i++) {
				for(int j = 0; j < w; j++) {
					if(map[i][j] == 1) {
						cnt++;
						DFS(i, j, h, w,map);
					}
				}
			}
			
			sb.append(cnt).append('\n');
		}
		
		System.out.println(sb);
		br.close();
	}
}
