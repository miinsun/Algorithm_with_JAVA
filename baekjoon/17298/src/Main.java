/* 백준 큐, 덱 - 11966 :: 요세푸스 문제 0 */
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Queue<Integer> q = new LinkedList<>();
		
		int N = sc.nextInt();	// N명의 사람
		int K = sc.nextInt();	// K번째 순서부터 제거
		
		for(int i = 1; i <= N; i++) {	// 큐에 사람 입력
			q.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append('<');
		while(q.size() != 1) {
			for(int i = 0; i < K - 1; i++)
				q.add(q.poll());
			
			// K번째 순서를 만나면
			sb.append(q.poll() + ", ");
		}
		
		sb.append(q.poll() + ">");
		
		System.out.println(sb);
		
		sc.close();
	}
}
