/* 백준 그래프 - 1967 :: 트리의 지름 */

import java.util.*;
import java.io.*;

class Node{
	int node, dist;
	public Node(int node, int dist) {
		this.node = node;
		this.dist = dist;
	}
}

public class Main {	
	static ArrayList<Node>[] list;
	static int n;
	static int max = 0;
	static int total = 0;
	static int leaf;
	
	static void dfs(int node, int parent, int total) {
		if(total > max) {
			max = total;
			leaf = node;
		}
		
		for(Node tmp : list[node]) {
			// 일대일 연결일때, 부모값은 무시
			if(tmp.node == parent) continue;
			dfs(tmp.node, node, tmp.dist + total);
		}
	}
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		
		list = new ArrayList[n + 1];
		for(int i = 0; i <= n; i++)
			list[i] = new ArrayList<>();
		
		for(int i = 0; i < n - 1; i++) {
			int s = sc.nextInt();
			int e = sc.nextInt();
			int len = sc.nextInt();
			
			list[s].add(new Node(e, len));
			list[e].add(new Node(s, len));

		}
		
		// 특정 정점에서 가장 멀리 있는 노드의 지름과 정보 얻기
		dfs(1, 0, 0);
		// 리프노드에서 올라오면서 가장 긴 지름 찾기
		dfs(leaf, 0, 0);
		
		System.out.println(max);
		sc.close();
	}
}