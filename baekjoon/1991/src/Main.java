/* 백준 그래프 - 1991 :: 트리 순회 */

import java.util.*;
import java.io.*;

// 노드
class Node { 
	public char data; 
	Node lt, rt;
	
	Node (char data){ 
		this.data = data;
	} 
}
	
class Tree{
	Node root;
	
	// 트리 입력
	void add(char data, char left, char right) {
		// 루트가 비어있으면 데이터 입력
		if(root == null) {
			if(data != '.')
				root = new Node(data);
			if(left != '.')
				root.lt = new Node(left);
			if(right != '.')
				root.rt = new Node(right);
		}
		else // 루트 외에는 자기 자리를 찾아줌
			search(root, data, left, right);
	}
	
	// 검색
	void search(Node root, char data, char left, char right) {
		// 노드가 비어있으면 종료
		if(root == null) return;
		else if(root.data == data) { // 찾고 있던 노드를 찾으면 정보 입력
			if(left != '.') 
				root.lt = new Node(left);
			if(right != '.')
				root.rt = new Node(right);
		}
		else { // 왼쪽 포인터, 오른쪽 포인터로 노드 찾기
			search(root.lt, data, left, right);
			search(root.rt, data, left, right);
		}
	}
	
	
	// 전위순회
	void preOrder(Node root) {
		//root -> left -> right
		System.out.print(root.data);
		if(root.lt != null) preOrder(root.lt);
		if(root.rt != null) preOrder(root.rt);
	}
	
	// 중위순회
	void inOrder(Node root) {
		// left -> root -> right
		if(root.lt != null) inOrder(root.lt);
		System.out.print(root.data);
		if(root.rt != null) inOrder(root.rt);
	}
	
	// 후위순회
	void postOrder(Node root) {
		// left -> right -> root
		if(root.lt != null) postOrder(root.lt);
		if(root.rt != null) postOrder(root.rt);
		System.out.print(root.data);
	}
}

public class Main {		
	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner (System.in);
		int n = sc.nextInt();
		
		// 트리 정보 입력
		Tree tree = new Tree();
		for(int i = 0; i < n; i++) {
			tree.add(sc.next().charAt(0), sc.next().charAt(0), sc.next().charAt(0));
		}
			
		tree.preOrder(tree.root);
		System.out.println();
		tree.inOrder(tree.root);
		System.out.println();
		tree.postOrder(tree.root);
		
		sc.close();
	}
}