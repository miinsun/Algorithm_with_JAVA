/* 백준 백트래킹 - 9663 :: N-Queen */
import java.io.*;
import java.util.*;

public class Main {
	static int n;
	static int[] arr;
	static StringBuilder sb = new StringBuilder();
	static int cnt = 0;
	
	public static void dfs(int level) {		
		if(level == n) {
			cnt++;
			return;
		}
		
		for(int i = 0; i < n; i++) {
			arr[level] = i;
			if(!killQueen(level)) {
				dfs(level + 1);
			}
		}
	}
	
	// 퀸을 죽일 수 있는 위치면 true, 아니면 false
	public static boolean killQueen(int x) {
		for(int i = 0; i < x; i++) {
			if(arr[x] == arr[i])
				return true;
			else if(Math.abs(x - i) == Math.abs(arr[x] - arr[i]))
				return true;
		}
		
		return false;
	}
	
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
		n = Integer.parseInt(br.readLine());
		arr = new int [n];
		
		dfs(0);
		
		System.out.println(cnt);
		br.close();
	}
}
