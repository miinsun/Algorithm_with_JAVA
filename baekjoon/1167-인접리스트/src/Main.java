/* 백준 그래프 - 1167 :: 트리의 지름 - 인접리스 */

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
	static boolean[] check;
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
		check = new boolean[n + 1];
		
		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			while(true) {
				int e = sc.nextInt();
				if(e == -1) break;
				list[s].add(new Node(e, sc.nextInt()));
			}
		}
		
		// 특정 정점에서 가장 멀리 있는 노드의 지름과 정보 얻기
		dfs(1, 0, 0);
		// 리프노드에서 올라오면서 가장 긴 지름 찾기
		dfs(leaf, 0, 0);
		
		System.out.println(max);
		sc.close();
	}
}