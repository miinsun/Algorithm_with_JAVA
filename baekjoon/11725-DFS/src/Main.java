/* 백준 그래프 - 11725 :: 트리의 부모 찾기 - dfs */

import java.util.*;
import java.io.*;

public class Main {
	static List<Integer>[] list;
	static int[] parent;
	static boolean[] check;
	static int n;
	
	static void dfs(int l) {
		// 중복 체크
		check[l] = true;
		
		// 가장 처음에 나오는 값이 무조건 부모
		for(int i : list[l]) {
			// 중복 검사
			if(!check[i]) {
				parent[i] = l;
				dfs(i);
			}
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();

		list =  new ArrayList[n + 1];
		parent = new int[n+1];
		check = new boolean[n+1];
		
		// ArrayList 배열생성
		for(int i = 1; i <= n; i++) {
			list[i]  = new ArrayList<>();
		}
		
		// 노드 정보 입력
		for(int i = 0; i < n -1; i++) {
			int a = sc.nextInt();
			int b = sc.nextInt();
			
			list[a].add(b);
			list[b].add(a);
		}
		
		dfs(1);
		
		for(int i = 2; i <= n; i++) System.out.println(parent[i]);
		sc.close();
	}
}