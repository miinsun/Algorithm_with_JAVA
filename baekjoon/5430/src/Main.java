/* 백준 큐, 덱 - 5430 :: AC */
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int T = Integer.parseInt(br.readLine());	// 테스트 케이스의 크기
		
		StringBuilder sb = new StringBuilder();
		StringTokenizer st;
		ArrayDeque<Integer> q;
		boolean reverse;
		boolean error;
		String command;
		for(int i = 0; i < T; i++) {
			command = br.readLine();
			int n = Integer.parseInt(br.readLine());
			
			st = new StringTokenizer(br.readLine(), "[],");
			
			q = new ArrayDeque<Integer>();
			
			// 덱에 배열 원소를 넣어준다.
			for(int j = 0; j < n; j++) {
				q.add(Integer.parseInt(st.nextToken()));
			}
			
			error = false;
			reverse = false;
			for(char c : command.toCharArray()) {
				if(c == 'R') {	// Reverse :: 뒤집기
					if(q.isEmpty()) {
						error = true;
						break;
					}
					else
						reverse = !reverse;
				}
				else {	// Delete :: 맨 뒤 or 맨 앞 큐 삭제
					if(q.isEmpty()) {
						error = true;
						break;
					}
					else {
						if(reverse)
							q.pollLast();
						else
							q.pollFirst();
					}
				}
			}
			
			if(error) {
				sb.append("error").append('\n');
			}
			else {
				sb.append('[');
				while(q.size() != 1) {
					if(reverse) {
						sb.append(q.pollLast()).append(',');
					}
					else {
						sb.append(q.pollFirst()).append(',');
					}
				}
				sb.append(q.poll()).append(']').append('\n');
			}
		}
		
		System.out.println(sb);
		br.close();
	}
}
