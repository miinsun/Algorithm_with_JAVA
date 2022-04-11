/* 백준 백트래킹 - 15650 :: N과 M (2) */
import java.io.*;
import java.util.*;

public class Main {
	static int[] arr;
	public static void dfs(int at, int n, int m, int level) {
		if(m == level) {
			for(int x : arr) {
				System.out.print(x + " ");
			}
			System.out.println();
			return;
		}
		
		for(int i = at; i <= n; i++) {
			arr[level] = i;
			dfs(i + 1, n, m, level + 1);
		}
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		arr = new int[m];
		dfs(1, n, m, 0);
		
		br.close();
	}
}
