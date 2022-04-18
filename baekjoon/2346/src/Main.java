/* 백준 자료구조 - 2346 :: 풍선 터뜨리기 */
import java.util.*;
import java.io.*;

class Balloon {
	int number;
	int move;
	
	Balloon(int number, int move){
		this.number = number;
		this.move = move;
	}
}

public class Main {
	public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());// 풍선의 수
		
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
		Deque<Balloon> q = new ArrayDeque<>();
		for(int i = 1; i <= N; i++) {
			q.add(new Balloon(i, Integer.parseInt(st.nextToken())));
		}
		
		
		while(q.size() != 1) {
			Balloon tmp = q.poll();
			sb.append(tmp.number + " ");
			
			if(tmp.move > 0) {
				tmp.move--;
				while(tmp.move-- > 0)
					q.addLast(q.pollFirst());
			}
			else {
				while(tmp.move++ < 0)
					q.addFirst(q.pollLast());
			}
		}
		sb.append(q.poll().number + " ");
		
		System.out.println(sb);
		br.close();
	}
}


