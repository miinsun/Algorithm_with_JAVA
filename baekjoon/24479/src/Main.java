/* 백준 그래프와 순회 - 24479 :: 알고리즘 수업 - 깊이 우선 탑색 1 */

import java.io.*;

import java.util.*;
public class Main {
	static boolean[][] board;
	static int[] visited;
	static int n, m;
	
	public static void dfs(int start, int depth) {
		visited[start] = depth;
		
		for(int i = 1; i <= n; i++) {
			if(board[start][i] && visited[i] == 0) {
				dfs(i, depth + 1);
			}
		}
	}
	
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        n = Integer.parseInt(st.nextToken());
        m = Integer.parseInt(st.nextToken());        
        int start = Integer.parseInt(st.nextToken());

        board = new boolean[n + 1][n + 1];
        visited = new int[n + 1];
        
        for(int i = 0; i < m; i++) {
            st = new StringTokenizer(br.readLine());
            board[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = true;
        }
        
        dfs(start, 1);
        
        for(int i = 1; i <= n; i++) {
        	System.out.println(visited[i]);
        }
    }
}
