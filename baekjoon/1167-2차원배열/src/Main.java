/* 백준 그래프 - 1167 :: 트리의 지름 -2차원배열(메모리 초과) */

import java.util.*;
import java.io.*;

public class Main {	
	static short[][] arr;
	static boolean[] check;
	static int n;
	static int max = 0;
	static int total = 0;
	
	static void dfs(int s, int e) {
		check[s] = true;
		
		if(total > max) {
			max = total;
		}
		
		for(int i = 1; i <= n; i++) {
			if(arr[e][i] != 0 && !check[i]) {
				total += arr[e][i];
				dfs(e, i);
				total -= arr[e][i];
			}
		}
	}
	
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		arr = new short[n + 1][n + 1];

		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			while(true) {
				int e = sc.nextInt();
				if(e == -1) break;
				arr[s][e] = sc.nextShort();
			}
		}
		
		// 트리 
		for(int i = 1; i <= n; i++) {
			check = new boolean[n + 1];
			for(int j = 1; j <= n; j++) {
				if(arr[i][j] != 0) {
					total = arr[i][j];
					dfs(i, j);
					total = 0;
				}
			}
		}
		
		System.out.println(max);
		sc.close();
	}
}