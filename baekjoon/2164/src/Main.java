/* 백준 자료구조 - 2164 :: 카드2*/
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine()); 

		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		
		while(queue.size() != 1) {
			// 가장 위에 있는 카드 버리기
			queue.poll();
			
			// 제일 위에 있는 카드를 제일 아래로 옮긴다
			queue.add(queue.poll());
		}
		
		System.out.println(queue.poll());
		br.close();
	}
}
