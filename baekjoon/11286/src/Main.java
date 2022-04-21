/* 백준 우선순위큐 - 11286 :: 절댓값 힙 */
import java.util.*;
import java.io.*;

public class Main {
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		
		// 우선순위 큐 생성 :: 작은 수가 위로 가도록 정렬
		PriorityQueue<Integer> q = new PriorityQueue <>((o1, o2) -> {
			int abs1 = Math.abs(o1);
            int abs2 = Math.abs(o2);

            if(abs1 == abs2) return o1 > o2 ? 1 : -1;
            return abs1 - abs2;
		});
		
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < N; i++) {
			int x = Integer.parseInt(br.readLine());
			
			if(x == 0) {	// 가장 작은 수를 출력
				if(q.isEmpty())
					sb.append(0).append('\n');
				else {
					sb.append(q.poll()).append('\n');
				}
			}
			else {	// 큐에 x를 추가
				q.add(x);
			}
		}
		
		System.out.println(sb);
		
		br.close();
	}
}
