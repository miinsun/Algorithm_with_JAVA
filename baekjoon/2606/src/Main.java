/* 백준 DFS와 BFS - 2606 :: 바이러스 */

import java.io.*;
import java.util.*;

public class Main {
	static boolean[][] network;
	static boolean[] visit;
	static int answer = 0;
	static int N, M;
	
	public static void dfs(int n) {
		visit[n] = true;
		
		for(int i = 1; i <= N; i++) {
			if(network[n][i] && !visit[i]) {
				answer++;
				visit[i] = true;
				dfs(i);				
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		N = Integer.parseInt(br.readLine());
		M = Integer.parseInt(br.readLine());
		
		network = new boolean[N+1][N+1];
		visit = new boolean[N+1];
		for(int i = 0; i < M; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int s = Integer.parseInt(st.nextToken());
			int e = Integer.parseInt(st.nextToken());
			
			network[s][e] = true;
			network[e][s] = true;
		}
		
		dfs(1);
		
		System.out.println(answer);
		br.close();
	}
}
