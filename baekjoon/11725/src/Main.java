/* 백준 그래프 - 11725 :: 트리의 부모 찾기 - Tree */

import java.util.*;
import java.io.*;

// 노드
class Node { 
	public int data; 
	Node lt, rt, ut;
	
	Node (int data){ 
		this.data = data;
	} 
	Node (int data, Node ut){ 
		this.data = data;
		this.ut = ut;
	} 
}
	
class Tree{
	Node root = new Node (1);
	StringBuilder sb = new StringBuilder();

	// 입력
	void add(Node root, int a, int b) {
		// 노드가 비어있으면 종료
		if(root == null) return;
		else if(root.data == a) { // 찾고 있던 노드를 찾으면 정보 입력
			if(root.rt == null)
				root.rt = new Node(b, root);
			else
				root.lt = new Node(b, root);
		}
		else if(root.data == b) {
			if(root.rt == null)
				root.rt = new Node(a, root);
			else
				root.lt = new Node(a, root);
		}
		else { // 왼쪽 포인터, 오른쪽 포인터로 노드 찾기
			add(root.lt, a, b);
			add(root.rt, a, b);
		}
	}
	
	void search(Node root, int a) {
		if(root == null) return;
		if(root.data == a) { // 찾고 있던 노드를 찾으면 정보 입력
			sb.append(root.ut.data).append('\n');
		}
		else {
			search(root.lt, a);
			search(root.rt, a);
		}
	}
	
	void print(int n) { // 2 ~ n까지 부모 노드출
		for(int i = 2; i <= n; i++) {
			search(root, i);
		}
		
		System.out.println(sb);
	}
}

public class Main {		
	public static void main(String[] args) throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int n = Integer.parseInt(br.readLine());
				
		// 트리 정보 입력
		Tree tree = new Tree();
		for(int i = 0; i < n - 1; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			tree.add(tree.root, Integer.parseInt(st.nextToken()), Integer.parseInt(st.nextToken()));
		}
		
		tree.print(n);
		
		br.close();
	}
}