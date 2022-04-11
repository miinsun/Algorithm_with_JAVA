/* 백준 백트래킹 - 15652 :: N과 M (4) */
import java.io.*;
import java.util.*;

public class Main {
	static int[] arr;
	static boolean[] visit;
	static StringBuilder sb = new StringBuilder();
	
	public static void dfs(int prev, int n, int m, int level) {
		if(level == m) {
			for(int i : arr) {
				sb.append(i + " ");
			}
			sb.append('\n');
			return;
		}
		
		for(int i = 0; i < n; i++) {
			if(prev <= i) {
				arr[level] = i + 1;
				dfs(i, n, m, level + 1);
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		visit = new boolean[n];
		dfs(0, n, m , 0);
		
		System.out.println(sb);
		br.close();
	}
}
