/* 피자 배달 거리 :: DFS */

import java.util.*;

class Point {
	public int x, y;
	
	Point (int x, int y){
		this.x = x;
		this.y = y;
	}
}

public class Main {
	static int n, m, len, answer = Integer.MAX_VALUE;
	static int[] combi;
	static ArrayList<Point> pz, hs;
	
	public void DFS(int L, int s) {
		//피자집을 m개만큼 선택
		if(L == m) {
			int sum = 0;
			
			// 집들을 하나씩 나열
			for(Point h : hs) {
				int dis = Integer.MAX_VALUE;
				for(int i : combi) {
					dis = Math.min(dis, Math.abs(h.x - pz.get(i).x) + Math.abs(h.y - pz.get(i).y));
				}
				sum += dis;
			}
			answer = Math.min(sum, answer);
		}
		else {
			for(int i = s; i < len; i++) {
				combi[L] = i;
				DFS(L+1, i+1);
			}
		}
 	}
	
	public static void main(String[] args){
		Main main = new Main();
		Scanner sc = new Scanner(System.in);

		n = sc.nextInt();
		m = sc.nextInt();
		pz = new ArrayList<>();
		hs = new ArrayList<>();
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				int tmp = sc.nextInt();
				
				//좌표가 1이면 hs에 저장, 2면 pz에 저장
				if(tmp == 1) hs.add(new Point(i, j));
				else if(tmp == 2) pz.add(new Point(i, j));
			}
		}
		len = pz.size();
		combi = new int[m];
		
		main.DFS(0, 0);
		System.out.println(answer);
		sc.close();
		return ;
	}
}
