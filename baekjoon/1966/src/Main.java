/* 백준 자료구조 - 1966 :: 프린터 큐 */
import java.util.*;
import java.io.*;

class Paper {
	int order;
	int index;
	
	Paper(int order, int index){
		this.order = order;
		this.index = index;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();	// 테스트 케이스의 개수

		for(int i = 0; i < T; i++) {
			int N = sc.nextInt();	// 문서의 개수
			int M = sc.nextInt();	// 궁금한 문서 큐의 인덱스
			
			Queue<Paper> q = new LinkedList<>();
			for(int j = 0; j < N; j++) {
				q.add(new Paper(sc.nextInt(), j));
			}
			
			int order = 1;
			while(!q.isEmpty()) {
				Paper tmp = q.poll();
				boolean skip = false;
				
				// 큐 안에 중유도가 더 큰 paper가 있는지 검사
				for(Paper x : q) {
					if(x.order > tmp.order) {
						skip = true;
						break;
					}
				}
				
				if(skip) {	// 중요도가 더 큰 Paper가 있으면
					q.add(tmp);	// 가장 끝에 다시 추가
				}
				else {	// 가장 중유도가 높으면
					if(M == tmp.index) {	// 찾고자한 문서를 찾으면 출력 후 종
						System.out.println(order);
						break;
					}
					order++;
				}
			}
		}
		
		sc.close();
	}
}
