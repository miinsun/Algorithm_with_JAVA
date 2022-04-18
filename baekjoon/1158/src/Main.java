/* 백준 자료구조 - 1158 :: 요세푸스 문제*/
import java.util.*;
import java.io.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		StringTokenizer st = new StringTokenizer (br.readLine());
		int N = Integer.parseInt(st.nextToken()); 
		int K = Integer.parseInt(st.nextToken()); 

		Queue<Integer> queue = new LinkedList<>();
		for(int i = 1; i <= N; i++) {
			queue.add(i);
		}
		
		StringBuilder sb = new StringBuilder();
		sb.append("<");
		
		while(!queue.isEmpty()) {
			if(queue.size() == 1) {
				 sb.append(queue.poll() + ">");
				 break;
			}
			for (int i = 0; i < K - 1; i++) {
                queue.offer(queue.poll());
            }
            // K번째 값은 poll한 후 출력한다.
            sb.append(queue.poll() + ", ");
		}
		
		System.out.println(sb);
		br.close();
	}
}
